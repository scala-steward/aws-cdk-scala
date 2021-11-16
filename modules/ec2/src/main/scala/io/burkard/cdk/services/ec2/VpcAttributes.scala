package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcAttributes {

  def apply(
    vpcId: String,
    availabilityZones: List[String],
    publicSubnetIds: Option[List[String]] = None,
    isolatedSubnetNames: Option[List[String]] = None,
    vpcCidrBlock: Option[String] = None,
    privateSubnetNames: Option[List[String]] = None,
    privateSubnetRouteTableIds: Option[List[String]] = None,
    publicSubnetNames: Option[List[String]] = None,
    isolatedSubnetIds: Option[List[String]] = None,
    privateSubnetIds: Option[List[String]] = None,
    publicSubnetRouteTableIds: Option[List[String]] = None,
    vpnGatewayId: Option[String] = None,
    isolatedSubnetRouteTableIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.VpcAttributes =
    (new software.amazon.awscdk.services.ec2.VpcAttributes.Builder)
      .vpcId(vpcId)
      .availabilityZones(availabilityZones.asJava)
      .publicSubnetIds(publicSubnetIds.map(_.asJava).orNull)
      .isolatedSubnetNames(isolatedSubnetNames.map(_.asJava).orNull)
      .vpcCidrBlock(vpcCidrBlock.orNull)
      .privateSubnetNames(privateSubnetNames.map(_.asJava).orNull)
      .privateSubnetRouteTableIds(privateSubnetRouteTableIds.map(_.asJava).orNull)
      .publicSubnetNames(publicSubnetNames.map(_.asJava).orNull)
      .isolatedSubnetIds(isolatedSubnetIds.map(_.asJava).orNull)
      .privateSubnetIds(privateSubnetIds.map(_.asJava).orNull)
      .publicSubnetRouteTableIds(publicSubnetRouteTableIds.map(_.asJava).orNull)
      .vpnGatewayId(vpnGatewayId.orNull)
      .isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds.map(_.asJava).orNull)
      .build()
}
