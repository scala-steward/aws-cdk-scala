package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UpdateWirelessGatewayTaskCreateProperty {

  def apply(
    loRaWan: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty] = None,
    updateDataRole: Option[String] = None,
    updateDataSource: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder)
      .loRaWan(loRaWan.orNull)
      .updateDataRole(updateDataRole.orNull)
      .updateDataSource(updateDataSource.orNull)
      .build()
}