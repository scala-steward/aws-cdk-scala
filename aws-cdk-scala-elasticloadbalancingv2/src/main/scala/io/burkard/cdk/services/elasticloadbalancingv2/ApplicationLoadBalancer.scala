package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationLoadBalancer {

  def apply(
    internalResourceId: String,
    internetFacing: Option[Boolean] = None,
    idleTimeout: Option[software.amazon.awscdk.Duration] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deletionProtection: Option[Boolean] = None,
    loadBalancerName: Option[String] = None,
    ipAddressType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    http2Enabled: Option[Boolean] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer =
    software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.Builder
      .create(stackCtx, internalResourceId)
      .internetFacing(internetFacing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .idleTimeout(idleTimeout.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancerName(loadBalancerName.orNull)
      .ipAddressType(ipAddressType.orNull)
      .vpc(vpc.orNull)
      .http2Enabled(http2Enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroup(securityGroup.orNull)
      .build()
}
