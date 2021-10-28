package io.burkard.cdk.services.elasticloadbalancing

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancer {

  def apply(
    internalResourceId: String,
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancing.HealthCheck] = None,
    crossZone: Option[Boolean] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget]] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener]] = None,
    internetFacing: Option[Boolean] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    accessLoggingPolicy: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer =
    software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer.Builder
      .create(stackCtx, internalResourceId)
      .healthCheck(healthCheck.orNull)
      .crossZone(crossZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targets(targets.map(_.asJava).orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .internetFacing(internetFacing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subnetSelection(subnetSelection.orNull)
      .vpc(vpc.orNull)
      .accessLoggingPolicy(accessLoggingPolicy.orNull)
      .build()
}
