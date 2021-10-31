package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTargetBindOptions {

  def apply(
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.ITaskDefinition] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions =
    (new software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions.Builder)
      .cluster(cluster.orNull)
      .taskDefinition(taskDefinition.orNull)
      .build()
}
