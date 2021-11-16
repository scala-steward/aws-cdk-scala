package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnContainerRecipeProps {

  def apply(
    name: String,
    components: List[_],
    version: String,
    targetRepository: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty,
    parentImage: String,
    containerType: String,
    dockerfileTemplateData: Option[String] = None,
    dockerfileTemplateUri: Option[String] = None,
    kmsKeyId: Option[String] = None,
    imageOsVersionOverride: Option[String] = None,
    instanceConfiguration: Option[software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    platformOverride: Option[String] = None,
    workingDirectory: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps.Builder)
      .name(name)
      .components(components.asJava)
      .version(version)
      .targetRepository(targetRepository)
      .parentImage(parentImage)
      .containerType(containerType)
      .dockerfileTemplateData(dockerfileTemplateData.orNull)
      .dockerfileTemplateUri(dockerfileTemplateUri.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .imageOsVersionOverride(imageOsVersionOverride.orNull)
      .instanceConfiguration(instanceConfiguration.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .platformOverride(platformOverride.orNull)
      .workingDirectory(workingDirectory.orNull)
      .build()
}
