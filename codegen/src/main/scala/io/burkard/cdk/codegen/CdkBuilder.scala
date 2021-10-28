package io.burkard.cdk.codegen

import java.lang.reflect.{Method, Modifier}
import java.nio.file.{Path, Paths}

import io.burkard.cdk.codegen.CdkBuilder.ConstructorType

// Class instance builder provided by the CDK.
final case class CdkBuilder private(
  serviceName: String,
  instanceCanonicalName: String,
  instanceSimpleName: String,
  constructorType: CdkBuilder.ConstructorType,
  underlying: Class[_]
) {
  // [0, N] field methods of the underlying builder.
  private[this] lazy val fieldMethods: List[FieldMethod] =
    underlying
      .getMethods
      .toList
      .flatMap { method =>
        FieldMethod
          .validFieldMethodTypeName(method)
          .map(method.getName -> _)
      }
      .groupBy(_._1)
      .view
      .mapValues(_.map(_._2))
      // Potentially rename field methods.
      .flatMap {
        // Name is unique, do nothing extra.
        case (methodName, typeName :: Nil) =>
          List(
            FieldMethod(
              methodName,
              methodName,
              typeName,
              optional = true
            )
          )

        // Name is shared, need to rename based on index.
        // TODO Change to something more meaningful.
        case (methodName, methods) =>
          methods.zipWithIndex.map { case (typeName, index) =>
            FieldMethod(
              s"$methodName$index",
              methodName,
              typeName,
              optional = true
            )
          }
      }
      .toList

  lazy val packageName: String = renamePackage(underlying.getPackageName)

  lazy val parameters: List[String] =
    fieldMethods.map(_.asParameter)

  lazy val parameterNames: List[String] =
    fieldMethods.map(_.actualParameterName)

  lazy val builderMethods: List[String] =
    fieldMethods.map(_.asBuilderMethod)

  lazy val imports: String = {
    lazy val fieldMethodsRequireAsJava = fieldMethods.exists(_.requiresAsJava)
    lazy val createMethodsRequireAsJava = constructorType match {
      case CdkBuilder.ConstructorType.CreateParameters(createParameters) =>
        createParameters.exists(_.requiresAsJava)

      case _ =>
        false
    }

    if (fieldMethodsRequireAsJava || createMethodsRequireAsJava) {
      "\nimport scala.jdk.CollectionConverters._\n"
    } else {
      ""
    }
  }

  lazy val applyMethodSignature: String = constructorType match {
    // Add in fields as parameters if required.
    case CdkBuilder.ConstructorType.CreateContextAndId =>
      if (fieldMethods.nonEmpty) {
        s"""def apply(
           |    internalResourceId: String,
           |    ${parameters.mkString(",\n    ")}
           |  )(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName""".stripMargin
      } else {
        s"def apply(id: String)(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName"
      }

    // Add in create params and fields as params.
    case CdkBuilder.ConstructorType.CreateParameters(createParameters) =>
      s"""def apply(
         |    ${createParameters.map(_.asParameter).mkString(",\n    ")},
         |    ${parameters.mkString(",\n    ")}
         |  ): $instanceCanonicalName""".stripMargin

    // Add in fields as parameters if required.
    case CdkBuilder.ConstructorType.CreateNoParameters | CdkBuilder.ConstructorType.DirectConstructorNoParameters =>
      if (fieldMethods.nonEmpty) {
        s"""def apply(
           |    ${parameters.mkString(",\n    ")}
           |  ): $instanceCanonicalName""".stripMargin
      } else {
        s"def apply: $instanceCanonicalName"
      }
  }

  lazy val builderSyntax: String = constructorType match {
    case ConstructorType.CreateContextAndId =>
      s"""$instanceCanonicalName.Builder
         |      .create(stackCtx, internalResourceId)""".stripMargin

    case ConstructorType.CreateParameters(createParameters) =>
      s"""$instanceCanonicalName.Builder
         |      .create(${createParameters.map(_.asValue).mkString(", ")})""".stripMargin

    case ConstructorType.CreateNoParameters =>
      s"""$instanceCanonicalName.Builder
         |      .create()""".stripMargin

    case ConstructorType.DirectConstructorNoParameters =>
      s"(new $instanceCanonicalName.Builder)"
  }
}

object CdkBuilder {

  implicit val sourceGenerator: SourceGenerator[CdkBuilder] =
    new SourceGenerator[CdkBuilder] {
      override def moduleName(source: CdkBuilder): String =
        source.serviceName

      override def path(source: CdkBuilder): Path =
        Paths.get(
          "modules",
          s"${source.serviceName}/src/main/scala/${source.packageName.replaceAll("\\.", "/")}/${source.instanceSimpleName}.scala".split("/"): _*
        )

      override def gen(source: CdkBuilder): String =
        s"""package ${source.packageName}
           |${source.imports}
           |@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
           |object ${source.instanceSimpleName} {
           |
           |  ${source.applyMethodSignature} =
           |    ${source.builderSyntax}
           |      ${source.builderMethods.mkString("\n      ")}
           |      .build()
           |}
           |""".stripMargin
    }

  // Using Java reflection to identify which CDK classes we can codegen.
  // Not using Scala reflection because of 2.x/3.x API differences.
  def build(serviceName: String, underlying: Class[_]): Option[CdkBuilder] =
    if (underlying.getSimpleName == "Builder") {
      for {
        // Pick the constructor type.
        constructorType <- constructorType(underlying)

        // Must have a `build` method.
        _ <- buildMethod(underlying)

        instanceCanonicalName = underlying.getCanonicalName.split("\\.").toList.dropRight(1).mkString(".")

        instanceSimpleName <- instanceCanonicalName.split("\\.").toList.lastOption
      } yield CdkBuilder(serviceName, instanceCanonicalName, instanceSimpleName, constructorType, underlying)
    } else {
      None
    }

  // What type of constructor is used to create the builder.
  sealed trait ConstructorType extends Product with Serializable

  object ConstructorType {
    // public static Builder create(context, id)
    case object CreateContextAndId extends ConstructorType

    // public static Builder create(...)
    final case class CreateParameters(createParameters: List[FieldMethod]) extends ConstructorType

    // public static Builder create()
    case object CreateNoParameters extends ConstructorType

    // new Builder()
    case object DirectConstructorNoParameters extends ConstructorType
  }

  private[this] def constructorType(underlying: Class[_]): Option[ConstructorType] =
    underlying.getMethods.toList
      // Pick "create" method with most parameters first.
      .sortBy(_.getParameterCount)
      .collectFirst {
        case m if m.getName == "create" && Modifier.isStatic(m.getModifiers) =>
          if (isContextAndIdConstructor(m)) {
            ConstructorType.CreateContextAndId
          } else if (m.getParameterCount != 0) {
            ConstructorType.CreateParameters(
              underlying
                .getDeclaredFields
                .toList
                .filterNot(_.getType.getName.contains("Builder"))
                .map( field =>
                  FieldMethod(
                    field.getName,
                    field.getName,
                    field.getGenericType.getTypeName,
                    optional = false
                  )
                )
            )
          } else {
            ConstructorType.CreateNoParameters
          }
      }
      // Or, check if there's a public constructor with no parameters.
      .orElse(
        underlying.getConstructors.toList.collectFirst {
          case c if c.getParameterCount == 0 && Modifier.isPublic(c.getModifiers) =>
            ConstructorType.DirectConstructorNoParameters
        }
      )

  private[this] def isContextAndIdConstructor(m: Method): Boolean =
    m.getParameterTypes.toList.map(_.getSimpleName) match {
      case "Construct" :: "String" :: Nil =>
        true

      case _ =>
        false
    }

  // public Underlying build()
  private[this] def buildMethod(underlying: Class[_]): Option[Method] =
    underlying.getMethods
      .find(m => m.getName == "build" && !Modifier.isStatic(m.getModifiers) && m.getParameterCount == 0)
}