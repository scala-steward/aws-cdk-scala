package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualRouterProps {

  def apply(
    meshName: Option[String] = None,
    virtualRouterName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty] = None,
    meshOwner: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps.Builder)
      .meshName(meshName.orNull)
      .virtualRouterName(virtualRouterName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .spec(spec.orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
