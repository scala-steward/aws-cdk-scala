package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortRange {

  def apply(
    toPort: Option[Number] = None,
    fromPort: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.PortRange =
    (new software.amazon.awscdk.services.globalaccelerator.PortRange.Builder)
      .toPort(toPort.orNull)
      .fromPort(fromPort.orNull)
      .build()
}
