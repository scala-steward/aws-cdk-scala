package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnKnowledgeBase {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    renderingConfiguration: Option[software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty] = None,
    knowledgeBaseType: Option[String] = None,
    serverSideEncryptionConfiguration: Option[software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty] = None,
    sourceConfiguration: Option[software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase =
    software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .renderingConfiguration(renderingConfiguration.orNull)
      .knowledgeBaseType(knowledgeBaseType.orNull)
      .serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.orNull)
      .sourceConfiguration(sourceConfiguration.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
