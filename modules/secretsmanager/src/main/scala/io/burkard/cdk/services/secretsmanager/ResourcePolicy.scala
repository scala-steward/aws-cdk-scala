package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourcePolicy {

  def apply(
    internalResourceId: String,
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.ResourcePolicy =
    software.amazon.awscdk.services.secretsmanager.ResourcePolicy.Builder
      .create(stackCtx, internalResourceId)
      .secret(secret.orNull)
      .build()
}
