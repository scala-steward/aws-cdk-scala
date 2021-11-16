package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PipelineNotifyOnOptions {

  def apply(
    events: List[_ <: software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents],
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions =
    (new software.amazon.awscdk.services.codepipeline.PipelineNotifyOnOptions.Builder)
      .events(events.asJava)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .build()
}
