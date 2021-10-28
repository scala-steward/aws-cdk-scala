package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeviceFleetProps {

  def apply(
    deviceFleetName: Option[String] = None,
    outputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty] = None,
    roleArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps =
    (new software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps.Builder)
      .deviceFleetName(deviceFleetName.orNull)
      .outputConfig(outputConfig.orNull)
      .roleArn(roleArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}