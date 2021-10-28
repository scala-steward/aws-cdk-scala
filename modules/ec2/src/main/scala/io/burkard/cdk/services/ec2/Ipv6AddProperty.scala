package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Ipv6AddProperty {

  def apply(
    ipv6Address: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty.Builder)
      .ipv6Address(ipv6Address.orNull)
      .build()
}