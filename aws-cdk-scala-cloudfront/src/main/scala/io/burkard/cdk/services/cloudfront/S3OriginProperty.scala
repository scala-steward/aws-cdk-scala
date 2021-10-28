package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3OriginProperty {

  def apply(
    originAccessIdentity: Option[String] = None,
    domainName: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder)
      .originAccessIdentity(originAccessIdentity.orNull)
      .domainName(domainName.orNull)
      .build()
}
