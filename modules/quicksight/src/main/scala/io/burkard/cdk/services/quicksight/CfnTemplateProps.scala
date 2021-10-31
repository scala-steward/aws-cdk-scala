package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTemplateProps {

  def apply(
    name: Option[String] = None,
    awsAccountId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    templateId: Option[String] = None,
    versionDescription: Option[String] = None,
    sourceEntity: Option[software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceEntityProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplateProps =
    (new software.amazon.awscdk.services.quicksight.CfnTemplateProps.Builder)
      .name(name.orNull)
      .awsAccountId(awsAccountId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .templateId(templateId.orNull)
      .versionDescription(versionDescription.orNull)
      .sourceEntity(sourceEntity.orNull)
      .build()
}
