package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthorizationProperty {

  def apply(
    secretsRoleArn: String,
    cdnIdentifierSecret: String
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty.Builder)
      .secretsRoleArn(secretsRoleArn)
      .cdnIdentifierSecret(cdnIdentifierSecret)
      .build()
}
