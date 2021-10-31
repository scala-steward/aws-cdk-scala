package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsRunTaskProps {

  def apply(
    launchTarget: Option[software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget] = None,
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride]] = None,
    resultPath: Option[String] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.TaskDefinition] = None,
    resultSelector: Option[Map[String, _]] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps.Builder)
      .launchTarget(launchTarget.orNull)
      .subnets(subnets.orNull)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .resultPath(resultPath.orNull)
      .heartbeat(heartbeat.orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .taskDefinition(taskDefinition.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
