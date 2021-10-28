package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcGatewayRouteActionProperty {

  def apply(
    rewrite: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty] = None,
    target: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty.Builder)
      .rewrite(rewrite.orNull)
      .target(target.orNull)
      .build()
}
