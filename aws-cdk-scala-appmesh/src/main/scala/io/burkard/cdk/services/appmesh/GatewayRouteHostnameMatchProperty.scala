package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteHostnameMatchProperty {

  def apply(
    suffix: Option[String] = None,
    exact: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder)
      .suffix(suffix.orNull)
      .exact(exact.orNull)
      .build()
}
