package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MarketoConnectorProfileCredentialsProperty {

  def apply(
    clientId: String,
    clientSecret: String,
    connectorOAuthRequest: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty] = None,
    accessToken: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty.Builder)
      .clientId(clientId)
      .clientSecret(clientSecret)
      .connectorOAuthRequest(connectorOAuthRequest.orNull)
      .accessToken(accessToken.orNull)
      .build()
}
