package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerTargetOptions {

  def apply(
    containerName: Option[String] = None,
    containerPort: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None
  ): software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions =
    (new software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions.Builder)
      .containerName(containerName.orNull)
      .containerPort(containerPort.orNull)
      .protocol(protocol.orNull)
      .build()
}