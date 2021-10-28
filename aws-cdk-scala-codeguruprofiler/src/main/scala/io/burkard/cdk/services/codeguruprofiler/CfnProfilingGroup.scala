package io.burkard.cdk.services.codeguruprofiler

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProfilingGroup {

  def apply(
    internalResourceId: String,
    profilingGroupName: Option[String] = None,
    computePlatform: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    agentPermissions: Option[AnyRef] = None,
    anomalyDetectionNotificationConfiguration: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup =
    software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.Builder
      .create(stackCtx, internalResourceId)
      .profilingGroupName(profilingGroupName.orNull)
      .computePlatform(computePlatform.orNull)
      .tags(tags.map(_.asJava).orNull)
      .agentPermissions(agentPermissions.orNull)
      .anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.map(_.asJava).orNull)
      .build()
}
