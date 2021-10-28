package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogPublishingOptionProperty {

  def apply(
    enabled: Option[Boolean] = None,
    cloudWatchLogsLogGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.LogPublishingOptionProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn.orNull)
      .build()
}
