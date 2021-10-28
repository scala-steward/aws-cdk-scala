package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MonitoringProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
