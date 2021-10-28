package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthenticationConfigurationProperty {

  def apply(
    connectionArn: Option[String] = None,
    accessRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty.Builder)
      .connectionArn(connectionArn.orNull)
      .accessRoleArn(accessRoleArn.orNull)
      .build()
}