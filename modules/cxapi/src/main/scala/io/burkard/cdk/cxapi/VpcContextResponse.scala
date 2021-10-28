package io.burkard.cdk.cxapi

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcContextResponse {

  def apply(
    publicSubnetIds: Option[List[String]] = None,
    isolatedSubnetNames: Option[List[String]] = None,
    vpcId: Option[String] = None,
    privateSubnetNames: Option[List[String]] = None,
    privateSubnetRouteTableIds: Option[List[String]] = None,
    publicSubnetNames: Option[List[String]] = None,
    isolatedSubnetIds: Option[List[String]] = None,
    privateSubnetIds: Option[List[String]] = None,
    availabilityZones: Option[List[String]] = None,
    publicSubnetRouteTableIds: Option[List[String]] = None,
    vpnGatewayId: Option[String] = None,
    isolatedSubnetRouteTableIds: Option[List[String]] = None,
    vpcCidrBlock: Option[String] = None,
    subnetGroups: Option[List[_ <: software.amazon.awscdk.cxapi.VpcSubnetGroup]] = None
  ): software.amazon.awscdk.cxapi.VpcContextResponse =
    (new software.amazon.awscdk.cxapi.VpcContextResponse.Builder)
      .publicSubnetIds(publicSubnetIds.map(_.asJava).orNull)
      .isolatedSubnetNames(isolatedSubnetNames.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .privateSubnetNames(privateSubnetNames.map(_.asJava).orNull)
      .privateSubnetRouteTableIds(privateSubnetRouteTableIds.map(_.asJava).orNull)
      .publicSubnetNames(publicSubnetNames.map(_.asJava).orNull)
      .isolatedSubnetIds(isolatedSubnetIds.map(_.asJava).orNull)
      .privateSubnetIds(privateSubnetIds.map(_.asJava).orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .publicSubnetRouteTableIds(publicSubnetRouteTableIds.map(_.asJava).orNull)
      .vpnGatewayId(vpnGatewayId.orNull)
      .isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds.map(_.asJava).orNull)
      .vpcCidrBlock(vpcCidrBlock.orNull)
      .subnetGroups(subnetGroups.map(_.asJava).orNull)
      .build()
}