package io.burkard.cdk.services.certificatemanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCertificateProps {

  def apply(
    domainValidationOptions: Option[List[_]] = None,
    validationMethod: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    certificateAuthorityArn: Option[String] = None,
    domainName: Option[String] = None,
    certificateTransparencyLoggingPreference: Option[String] = None,
    subjectAlternativeNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.certificatemanager.CfnCertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder)
      .domainValidationOptions(domainValidationOptions.map(_.asJava).orNull)
      .validationMethod(validationMethod.orNull)
      .tags(tags.map(_.asJava).orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .domainName(domainName.orNull)
      .certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .build()
}