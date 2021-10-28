package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OpenMonitoringProperty {

  def apply(
    prometheus: Option[software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty.Builder)
      .prometheus(prometheus.orNull)
      .build()
}
