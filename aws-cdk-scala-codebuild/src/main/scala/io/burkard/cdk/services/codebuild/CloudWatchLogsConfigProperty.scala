package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchLogsConfigProperty {

  def apply(
    streamName: Option[String] = None,
    groupName: Option[String] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder)
      .streamName(streamName.orNull)
      .groupName(groupName.orNull)
      .status(status.orNull)
      .build()
}
