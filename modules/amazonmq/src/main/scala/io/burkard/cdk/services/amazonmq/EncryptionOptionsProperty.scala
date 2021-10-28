package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionOptionsProperty {

  def apply(
    useAwsOwnedKey: Option[Boolean] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty.Builder)
      .useAwsOwnedKey(useAwsOwnedKey.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}