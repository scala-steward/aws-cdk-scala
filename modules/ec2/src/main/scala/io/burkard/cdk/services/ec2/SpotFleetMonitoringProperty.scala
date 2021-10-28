package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpotFleetMonitoringProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}