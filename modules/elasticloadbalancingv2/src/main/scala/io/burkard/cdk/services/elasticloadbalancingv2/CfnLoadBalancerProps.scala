package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoadBalancerProps {

  def apply(
    subnets: Option[List[String]] = None,
    name: Option[String] = None,
    loadBalancerAttributes: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    scheme: Option[String] = None,
    subnetMappings: Option[List[_]] = None,
    ipAddressType: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .name(name.orNull)
      .loadBalancerAttributes(loadBalancerAttributes.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .scheme(scheme.orNull)
      .subnetMappings(subnetMappings.map(_.asJava).orNull)
      .ipAddressType(ipAddressType.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
