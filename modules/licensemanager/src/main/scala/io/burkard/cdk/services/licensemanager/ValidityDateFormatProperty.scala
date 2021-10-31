package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ValidityDateFormatProperty {

  def apply(
    begin: Option[String] = None,
    end: Option[String] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty.Builder)
      .begin(begin.orNull)
      .end(end.orNull)
      .build()
}
