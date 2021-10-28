package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ModelBiasAppSpecificationProperty {

  def apply(
    imageUri: Option[String] = None,
    configUri: Option[String] = None,
    environment: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder)
      .imageUri(imageUri.orNull)
      .configUri(configUri.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}