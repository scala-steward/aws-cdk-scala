package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecretTargetAttachmentProps {

  def apply(
    secretId: Option[String] = None,
    targetId: Option[String] = None,
    targetType: Option[String] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps =
    (new software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder)
      .secretId(secretId.orNull)
      .targetId(targetId.orNull)
      .targetType(targetType.orNull)
      .build()
}
