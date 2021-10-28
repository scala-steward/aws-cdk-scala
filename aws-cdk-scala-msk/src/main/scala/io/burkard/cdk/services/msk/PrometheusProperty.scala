package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrometheusProperty {

  def apply(
    nodeExporter: Option[software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty] = None,
    jmxExporter: Option[software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty.Builder)
      .nodeExporter(nodeExporter.orNull)
      .jmxExporter(jmxExporter.orNull)
      .build()
}
