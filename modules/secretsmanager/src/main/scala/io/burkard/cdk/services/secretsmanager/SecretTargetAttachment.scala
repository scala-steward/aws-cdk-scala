package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretTargetAttachment {

  def apply(
    internalResourceId: String,
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment =
    software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.Builder
      .create(stackCtx, internalResourceId)
      .secret(secret.orNull)
      .build()
}