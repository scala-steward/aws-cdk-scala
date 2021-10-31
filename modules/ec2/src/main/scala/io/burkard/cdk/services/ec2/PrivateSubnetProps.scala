package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateSubnetProps {

  def apply(
    vpcId: Option[String] = None,
    availabilityZone: Option[String] = None,
    cidrBlock: Option[String] = None,
    mapPublicIpOnLaunch: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.PrivateSubnetProps =
    (new software.amazon.awscdk.services.ec2.PrivateSubnetProps.Builder)
      .vpcId(vpcId.orNull)
      .availabilityZone(availabilityZone.orNull)
      .cidrBlock(cidrBlock.orNull)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
