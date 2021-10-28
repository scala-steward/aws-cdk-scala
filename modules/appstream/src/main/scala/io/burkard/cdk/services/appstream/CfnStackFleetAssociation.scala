package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStackFleetAssociation {

  def apply(
    internalResourceId: String,
    fleetName: Option[String] = None,
    stackName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnStackFleetAssociation =
    software.amazon.awscdk.services.appstream.CfnStackFleetAssociation.Builder
      .create(stackCtx, internalResourceId)
      .fleetName(fleetName.orNull)
      .stackName(stackName.orNull)
      .build()
}