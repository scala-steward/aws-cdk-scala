package io.burkard.cdk.services.licensemanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLicense {

  def apply(
    internalResourceId: String,
    consumptionConfiguration: Option[software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty] = None,
    licenseName: Option[String] = None,
    issuer: Option[software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty] = None,
    licenseMetadata: Option[List[_]] = None,
    status: Option[String] = None,
    productSku: Option[String] = None,
    validity: Option[software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty] = None,
    productName: Option[String] = None,
    entitlements: Option[List[_]] = None,
    beneficiary: Option[String] = None,
    homeRegion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.licensemanager.CfnLicense =
    software.amazon.awscdk.services.licensemanager.CfnLicense.Builder
      .create(stackCtx, internalResourceId)
      .consumptionConfiguration(consumptionConfiguration.orNull)
      .licenseName(licenseName.orNull)
      .issuer(issuer.orNull)
      .licenseMetadata(licenseMetadata.map(_.asJava).orNull)
      .status(status.orNull)
      .productSku(productSku.orNull)
      .validity(validity.orNull)
      .productName(productName.orNull)
      .entitlements(entitlements.map(_.asJava).orNull)
      .beneficiary(beneficiary.orNull)
      .homeRegion(homeRegion.orNull)
      .build()
}