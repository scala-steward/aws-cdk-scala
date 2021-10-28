package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessLogConfig {

  def apply(
    virtualNodeAccessLog: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty] = None,
    virtualGatewayAccessLog: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty] = None
  ): software.amazon.awscdk.services.appmesh.AccessLogConfig =
    (new software.amazon.awscdk.services.appmesh.AccessLogConfig.Builder)
      .virtualNodeAccessLog(virtualNodeAccessLog.orNull)
      .virtualGatewayAccessLog(virtualGatewayAccessLog.orNull)
      .build()
}
