package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PoliciesProperty {

  def apply(
    passwordPolicy: Option[software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder)
      .passwordPolicy(passwordPolicy.orNull)
      .build()
}
