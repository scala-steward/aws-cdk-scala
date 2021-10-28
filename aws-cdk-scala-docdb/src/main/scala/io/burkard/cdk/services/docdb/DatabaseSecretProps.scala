package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseSecretProps {

  def apply(
    username: Option[String] = None,
    masterSecret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    secretName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.docdb.DatabaseSecretProps =
    (new software.amazon.awscdk.services.docdb.DatabaseSecretProps.Builder)
      .username(username.orNull)
      .masterSecret(masterSecret.orNull)
      .secretName(secretName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
