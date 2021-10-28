package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretsManagerSecretOptions {

  def apply(
    versionId: Option[String] = None,
    versionStage: Option[String] = None,
    jsonField: Option[String] = None
  ): software.amazon.awscdk.SecretsManagerSecretOptions =
    (new software.amazon.awscdk.SecretsManagerSecretOptions.Builder)
      .versionId(versionId.orNull)
      .versionStage(versionStage.orNull)
      .jsonField(jsonField.orNull)
      .build()
}