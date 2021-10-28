package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayCapabilitySummaryProperty {

  def apply(
    capabilityNamespace: Option[String] = None,
    capabilityConfiguration: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayCapabilitySummaryProperty.Builder)
      .capabilityNamespace(capabilityNamespace.orNull)
      .capabilityConfiguration(capabilityConfiguration.orNull)
      .build()
}
