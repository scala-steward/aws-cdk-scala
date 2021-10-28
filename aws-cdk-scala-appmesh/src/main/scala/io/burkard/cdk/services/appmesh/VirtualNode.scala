package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualNode {

  def apply(
    internalResourceId: String,
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.BackendDefaults] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualNodeListener]] = None,
    backends: Option[List[_ <: software.amazon.awscdk.services.appmesh.Backend]] = None,
    serviceDiscovery: Option[software.amazon.awscdk.services.appmesh.ServiceDiscovery] = None,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    virtualNodeName: Option[String] = None,
    accessLog: Option[software.amazon.awscdk.services.appmesh.AccessLog] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.VirtualNode =
    software.amazon.awscdk.services.appmesh.VirtualNode.Builder
      .create(stackCtx, internalResourceId)
      .backendDefaults(backendDefaults.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .backends(backends.map(_.asJava).orNull)
      .serviceDiscovery(serviceDiscovery.orNull)
      .mesh(mesh.orNull)
      .virtualNodeName(virtualNodeName.orNull)
      .accessLog(accessLog.orNull)
      .build()
}
