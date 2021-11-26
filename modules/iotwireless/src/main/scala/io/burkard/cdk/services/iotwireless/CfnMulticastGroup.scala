package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMulticastGroup {

  def apply(
    internalResourceId: String,
    loRaWan: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty,
    name: Option[String] = None,
    associateWirelessDevice: Option[String] = None,
    disassociateWirelessDevice: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnMulticastGroup =
    software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.Builder
      .create(stackCtx, internalResourceId)
      .loRaWan(loRaWan)
      .name(name.orNull)
      .associateWirelessDevice(associateWirelessDevice.orNull)
      .disassociateWirelessDevice(disassociateWirelessDevice.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
