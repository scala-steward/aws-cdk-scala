package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetProps {

  def apply(
    assignIpv6AddressOnCreation: Option[Boolean] = None,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    cidrBlock: Option[String] = None,
    outpostArn: Option[String] = None,
    ipv6CidrBlock: Option[String] = None,
    mapPublicIpOnLaunch: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnSubnetProps =
    (new software.amazon.awscdk.services.ec2.CfnSubnetProps.Builder)
      .assignIpv6AddressOnCreation(assignIpv6AddressOnCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .cidrBlock(cidrBlock.orNull)
      .outpostArn(outpostArn.orNull)
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
