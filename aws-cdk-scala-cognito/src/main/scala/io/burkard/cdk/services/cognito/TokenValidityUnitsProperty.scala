package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TokenValidityUnitsProperty {

  def apply(
    idToken: Option[String] = None,
    refreshToken: Option[String] = None,
    accessToken: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty.Builder)
      .idToken(idToken.orNull)
      .refreshToken(refreshToken.orNull)
      .accessToken(accessToken.orNull)
      .build()
}
