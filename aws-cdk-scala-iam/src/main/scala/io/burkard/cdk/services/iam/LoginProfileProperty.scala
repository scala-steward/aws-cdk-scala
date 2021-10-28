package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoginProfileProperty {

  def apply(
    passwordResetRequired: Option[Boolean] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty =
    (new software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.Builder)
      .passwordResetRequired(passwordResetRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .password(password.orNull)
      .build()
}
