package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRouteTablePropagationProps {

  def apply(
    transitGatewayRouteTableId: Option[String] = None,
    transitGatewayAttachmentId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps.Builder)
      .transitGatewayRouteTableId(transitGatewayRouteTableId.orNull)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .build()
}
