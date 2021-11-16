package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeProps {

  def apply(
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.BackendDefaults] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualNodeListener]] = None,
    backends: Option[List[_ <: software.amazon.awscdk.services.appmesh.Backend]] = None,
    serviceDiscovery: Option[software.amazon.awscdk.services.appmesh.ServiceDiscovery] = None,
    virtualNodeName: Option[String] = None,
    accessLog: Option[software.amazon.awscdk.services.appmesh.AccessLog] = None
  ): software.amazon.awscdk.services.appmesh.VirtualNodeProps =
    (new software.amazon.awscdk.services.appmesh.VirtualNodeProps.Builder)
      .mesh(mesh)
      .backendDefaults(backendDefaults.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .backends(backends.map(_.asJava).orNull)
      .serviceDiscovery(serviceDiscovery.orNull)
      .virtualNodeName(virtualNodeName.orNull)
      .accessLog(accessLog.orNull)
      .build()
}
