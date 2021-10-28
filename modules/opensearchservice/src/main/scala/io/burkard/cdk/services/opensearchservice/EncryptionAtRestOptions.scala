package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionAtRestOptions {

  def apply(
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions =
    (new software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions.Builder)
      .kmsKey(kmsKey.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}