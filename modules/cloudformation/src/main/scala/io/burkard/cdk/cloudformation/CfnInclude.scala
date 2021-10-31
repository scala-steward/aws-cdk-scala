package io.burkard.cdk.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInclude {

  def apply(
    internalResourceId: String,
    preserveLogicalIds: Option[Boolean] = None,
    templateFile: Option[String] = None,
    loadNestedStacks: Option[Map[String, _ <: software.amazon.awscdk.cloudformation.include.CfnIncludeProps]] = None,
    parameters: Option[Map[String, _]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.cloudformation.include.CfnInclude =
    software.amazon.awscdk.cloudformation.include.CfnInclude.Builder
      .create(stackCtx, internalResourceId)
      .preserveLogicalIds(preserveLogicalIds.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .templateFile(templateFile.orNull)
      .loadNestedStacks(loadNestedStacks.map(_.asJava).orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
