package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDetectorModel {

  def apply(
    internalResourceId: String,
    detectorModelDefinition: software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty,
    roleArn: String,
    detectorModelDescription: Option[String] = None,
    detectorModelName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    evaluationMethod: Option[String] = None,
    key: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotevents.CfnDetectorModel =
    software.amazon.awscdk.services.iotevents.CfnDetectorModel.Builder
      .create(stackCtx, internalResourceId)
      .detectorModelDefinition(detectorModelDefinition)
      .roleArn(roleArn)
      .detectorModelDescription(detectorModelDescription.orNull)
      .detectorModelName(detectorModelName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .evaluationMethod(evaluationMethod.orNull)
      .key(key.orNull)
      .build()
}
