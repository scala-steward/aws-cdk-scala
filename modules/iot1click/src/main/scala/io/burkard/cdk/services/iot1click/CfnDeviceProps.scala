package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceProps {

  def apply(
    enabled: Option[Boolean] = None,
    deviceId: Option[String] = None
  ): software.amazon.awscdk.services.iot1click.CfnDeviceProps =
    (new software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deviceId(deviceId.orNull)
      .build()
}
