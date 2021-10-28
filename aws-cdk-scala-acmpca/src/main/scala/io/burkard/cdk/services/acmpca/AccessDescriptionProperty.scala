package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessDescriptionProperty {

  def apply(
    accessMethod: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessMethodProperty] = None,
    accessLocation: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.GeneralNameProperty] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.AccessDescriptionProperty.Builder)
      .accessMethod(accessMethod.orNull)
      .accessLocation(accessLocation.orNull)
      .build()
}
