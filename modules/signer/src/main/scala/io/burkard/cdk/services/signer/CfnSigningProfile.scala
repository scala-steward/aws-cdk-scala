package io.burkard.cdk.services.signer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSigningProfile {

  def apply(
    internalResourceId: String,
    platformId: String,
    signatureValidityPeriod: Option[software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.signer.CfnSigningProfile =
    software.amazon.awscdk.services.signer.CfnSigningProfile.Builder
      .create(stackCtx, internalResourceId)
      .platformId(platformId)
      .signatureValidityPeriod(signatureValidityPeriod.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
