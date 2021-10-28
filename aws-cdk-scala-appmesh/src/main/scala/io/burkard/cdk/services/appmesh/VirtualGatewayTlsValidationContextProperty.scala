package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayTlsValidationContextProperty {

  def apply(
    trust: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty] = None,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.Builder)
      .trust(trust.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
