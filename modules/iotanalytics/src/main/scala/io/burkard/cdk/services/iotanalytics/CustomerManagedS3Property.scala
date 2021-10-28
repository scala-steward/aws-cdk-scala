package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomerManagedS3Property {

  def apply(
    roleArn: Option[String] = None,
    bucket: Option[String] = None,
    keyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property =
    (new software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property.Builder)
      .roleArn(roleArn.orNull)
      .bucket(bucket.orNull)
      .keyPrefix(keyPrefix.orNull)
      .build()
}