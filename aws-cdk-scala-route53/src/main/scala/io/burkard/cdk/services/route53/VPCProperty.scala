package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VPCProperty {

  def apply(
    vpcRegion: Option[String] = None,
    vpcId: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty =
    (new software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty.Builder)
      .vpcRegion(vpcRegion.orNull)
      .vpcId(vpcId.orNull)
      .build()
}
