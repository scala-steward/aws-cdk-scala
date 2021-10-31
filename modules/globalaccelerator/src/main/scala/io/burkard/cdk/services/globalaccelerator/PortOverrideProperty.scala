package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortOverrideProperty {

  def apply(
    endpointPort: Option[Number] = None,
    listenerPort: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty =
    (new software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.PortOverrideProperty.Builder)
      .endpointPort(endpointPort.orNull)
      .listenerPort(listenerPort.orNull)
      .build()
}
