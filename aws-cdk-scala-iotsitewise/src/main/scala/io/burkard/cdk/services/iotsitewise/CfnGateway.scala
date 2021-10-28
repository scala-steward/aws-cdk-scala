package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGateway {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    gatewayName: Option[String] = None,
    gatewayPlatform: Option[software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty] = None,
    gatewayCapabilitySummaries: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnGateway =
    software.amazon.awscdk.services.iotsitewise.CfnGateway.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .gatewayName(gatewayName.orNull)
      .gatewayPlatform(gatewayPlatform.orNull)
      .gatewayCapabilitySummaries(gatewayCapabilitySummaries.map(_.asJava).orNull)
      .build()
}
