package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRoutingControl {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    controlPanelArn: Option[String] = None,
    clusterArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl =
    software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .controlPanelArn(controlPanelArn.orNull)
      .clusterArn(clusterArn.orNull)
      .build()
}
