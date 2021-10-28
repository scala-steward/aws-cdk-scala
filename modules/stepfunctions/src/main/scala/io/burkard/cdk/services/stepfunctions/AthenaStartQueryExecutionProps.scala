package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AthenaStartQueryExecutionProps {

  def apply(
    workGroup: Option[String] = None,
    queryString: Option[String] = None,
    resultPath: Option[String] = None,
    clientRequestToken: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    queryExecutionContext: Option[software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext] = None,
    resultConfiguration: Option[software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps.Builder)
      .workGroup(workGroup.orNull)
      .queryString(queryString.orNull)
      .resultPath(resultPath.orNull)
      .clientRequestToken(clientRequestToken.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .queryExecutionContext(queryExecutionContext.orNull)
      .resultConfiguration(resultConfiguration.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}