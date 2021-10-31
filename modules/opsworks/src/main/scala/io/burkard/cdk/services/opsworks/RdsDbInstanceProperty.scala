package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RdsDbInstanceProperty {

  def apply(
    dbUser: Option[String] = None,
    rdsDbInstanceArn: Option[String] = None,
    dbPassword: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty =
    (new software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder)
      .dbUser(dbUser.orNull)
      .rdsDbInstanceArn(rdsDbInstanceArn.orNull)
      .dbPassword(dbPassword.orNull)
      .build()
}
