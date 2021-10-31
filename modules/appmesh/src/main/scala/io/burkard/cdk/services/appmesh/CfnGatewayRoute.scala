package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGatewayRoute {

  def apply(
    internalResourceId: String,
    meshName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    gatewayRouteName: Option[String] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty] = None,
    meshOwner: Option[String] = None,
    virtualGatewayName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnGatewayRoute =
    software.amazon.awscdk.services.appmesh.CfnGatewayRoute.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .gatewayRouteName(gatewayRouteName.orNull)
      .spec(spec.orNull)
      .meshOwner(meshOwner.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .build()
}
