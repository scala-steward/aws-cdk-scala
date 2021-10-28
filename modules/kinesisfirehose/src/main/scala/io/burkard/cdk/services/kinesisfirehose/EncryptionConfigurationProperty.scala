package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionConfigurationProperty {

  def apply(
    kmsEncryptionConfig: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty] = None,
    noEncryptionConfig: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder)
      .kmsEncryptionConfig(kmsEncryptionConfig.orNull)
      .noEncryptionConfig(noEncryptionConfig.orNull)
      .build()
}