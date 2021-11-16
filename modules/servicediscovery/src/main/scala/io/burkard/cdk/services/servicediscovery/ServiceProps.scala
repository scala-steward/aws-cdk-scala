package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceProps {

  def apply(
    namespace: software.amazon.awscdk.services.servicediscovery.INamespace,
    healthCheck: Option[software.amazon.awscdk.services.servicediscovery.HealthCheckConfig] = None,
    name: Option[String] = None,
    dnsTtl: Option[software.amazon.awscdk.Duration] = None,
    dnsRecordType: Option[software.amazon.awscdk.services.servicediscovery.DnsRecordType] = None,
    description: Option[String] = None,
    routingPolicy: Option[software.amazon.awscdk.services.servicediscovery.RoutingPolicy] = None,
    loadBalancer: Option[Boolean] = None,
    customHealthCheck: Option[software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig] = None
  ): software.amazon.awscdk.services.servicediscovery.ServiceProps =
    (new software.amazon.awscdk.services.servicediscovery.ServiceProps.Builder)
      .namespace(namespace)
      .healthCheck(healthCheck.orNull)
      .name(name.orNull)
      .dnsTtl(dnsTtl.orNull)
      .dnsRecordType(dnsRecordType.orNull)
      .description(description.orNull)
      .routingPolicy(routingPolicy.orNull)
      .loadBalancer(loadBalancer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customHealthCheck(customHealthCheck.orNull)
      .build()
}
