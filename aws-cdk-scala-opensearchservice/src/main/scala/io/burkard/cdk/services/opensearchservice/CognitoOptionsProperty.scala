package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CognitoOptionsProperty {

  def apply(
    enabled: Option[Boolean] = None,
    identityPoolId: Option[String] = None,
    roleArn: Option[String] = None,
    userPoolId: Option[String] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .identityPoolId(identityPoolId.orNull)
      .roleArn(roleArn.orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
