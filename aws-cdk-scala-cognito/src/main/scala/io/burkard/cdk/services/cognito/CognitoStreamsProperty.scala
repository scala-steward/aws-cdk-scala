package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CognitoStreamsProperty {

  def apply(
    streamingStatus: Option[String] = None,
    roleArn: Option[String] = None,
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder)
      .streamingStatus(streamingStatus.orNull)
      .roleArn(roleArn.orNull)
      .streamName(streamName.orNull)
      .build()
}
