package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnService {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    healthCheckCustomConfig: Option[software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty] = None,
    namespaceId: Option[String] = None,
    healthCheckConfig: Option[software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty] = None,
    dnsConfig: Option[software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty] = None,
    `type`: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CfnService =
    software.amazon.awscdk.services.servicediscovery.CfnService.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .healthCheckCustomConfig(healthCheckCustomConfig.orNull)
      .namespaceId(namespaceId.orNull)
      .healthCheckConfig(healthCheckConfig.orNull)
      .dnsConfig(dnsConfig.orNull)
      .`type`(`type`.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}