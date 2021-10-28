package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeBuildStartBuildProps {

  def apply(
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    environmentVariablesOverride: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    project: Option[software.amazon.awscdk.services.codebuild.IProject] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildProps.Builder)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .environmentVariablesOverride(environmentVariablesOverride.map(_.asJava).orNull)
      .project(project.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}