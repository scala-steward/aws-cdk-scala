package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnetCidrBlockProps {

  def apply(
    subnetId: Option[String] = None,
    ipv6CidrBlock: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps =
    (new software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps.Builder)
      .subnetId(subnetId.orNull)
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .build()
}