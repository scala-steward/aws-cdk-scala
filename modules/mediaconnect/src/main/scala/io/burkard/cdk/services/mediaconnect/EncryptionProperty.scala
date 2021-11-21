package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionProperty {

  def apply(
    algorithm: String,
    roleArn: String,
    resourceId: Option[String] = None,
    keyType: Option[String] = None,
    url: Option[String] = None,
    constantInitializationVector: Option[String] = None,
    region: Option[String] = None,
    deviceId: Option[String] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty.Builder)
      .algorithm(algorithm)
      .roleArn(roleArn)
      .resourceId(resourceId.orNull)
      .keyType(keyType.orNull)
      .url(url.orNull)
      .constantInitializationVector(constantInitializationVector.orNull)
      .region(region.orNull)
      .deviceId(deviceId.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
