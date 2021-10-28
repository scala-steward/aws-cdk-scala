package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStackFleetAssociationProps {

  def apply(
    fleetName: Option[String] = None,
    stackName: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps =
    (new software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder)
      .fleetName(fleetName.orNull)
      .stackName(stackName.orNull)
      .build()
}
