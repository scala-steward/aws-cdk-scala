package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PostgreSqlSettingsProperty {

  def apply(
    secretsManagerAccessRoleArn: Option[String] = None,
    secretsManagerSecretId: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty.Builder)
      .secretsManagerAccessRoleArn(secretsManagerAccessRoleArn.orNull)
      .secretsManagerSecretId(secretsManagerSecretId.orNull)
      .build()
}
