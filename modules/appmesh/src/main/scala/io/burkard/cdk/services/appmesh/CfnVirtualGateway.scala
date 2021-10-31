package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualGateway {

  def apply(
    internalResourceId: String,
    meshName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty] = None,
    meshOwner: Option[String] = None,
    virtualGatewayName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnVirtualGateway =
    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .spec(spec.orNull)
      .meshOwner(meshOwner.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .build()
}
