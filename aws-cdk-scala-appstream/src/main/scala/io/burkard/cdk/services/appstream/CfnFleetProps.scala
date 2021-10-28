package io.burkard.cdk.services.appstream

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFleetProps {

  def apply(
    displayName: Option[String] = None,
    domainJoinInfo: Option[software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty] = None,
    iamRoleArn: Option[String] = None,
    idleDisconnectTimeoutInSeconds: Option[Number] = None,
    enableDefaultInternetAccess: Option[Boolean] = None,
    instanceType: Option[String] = None,
    fleetType: Option[String] = None,
    maxUserDurationInSeconds: Option[Number] = None,
    computeCapacity: Option[software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty] = None,
    name: Option[String] = None,
    imageArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    vpcConfig: Option[software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty] = None,
    imageName: Option[String] = None,
    disconnectTimeoutInSeconds: Option[Number] = None,
    streamView: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnFleetProps =
    (new software.amazon.awscdk.services.appstream.CfnFleetProps.Builder)
      .displayName(displayName.orNull)
      .domainJoinInfo(domainJoinInfo.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds.orNull)
      .enableDefaultInternetAccess(enableDefaultInternetAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .fleetType(fleetType.orNull)
      .maxUserDurationInSeconds(maxUserDurationInSeconds.orNull)
      .computeCapacity(computeCapacity.orNull)
      .name(name.orNull)
      .imageArn(imageArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcConfig(vpcConfig.orNull)
      .imageName(imageName.orNull)
      .disconnectTimeoutInSeconds(disconnectTimeoutInSeconds.orNull)
      .streamView(streamView.orNull)
      .build()
}
