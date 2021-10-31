package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTlsAcmCertificateProperty {

  def apply(
    certificateArn: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty.Builder)
      .certificateArn(certificateArn.orNull)
      .build()
}
