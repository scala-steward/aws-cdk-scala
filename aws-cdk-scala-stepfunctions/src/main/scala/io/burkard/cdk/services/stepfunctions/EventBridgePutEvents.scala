package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventBridgePutEvents {

  def apply(
    internalResourceId: String,
    resultPath: Option[String] = None,
    entries: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry]] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEvents =
    software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEvents.Builder
      .create(stackCtx, internalResourceId)
      .resultPath(resultPath.orNull)
      .entries(entries.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
