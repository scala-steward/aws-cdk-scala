package io.burkard.cdk.services.ecs

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddAutoScalingGroupCapacityOptions {

  def apply(
    spotInstanceDraining: Option[Boolean] = None,
    canContainersAccessInstanceRole: Option[Boolean] = None,
    topicEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    machineImageType: Option[software.amazon.awscdk.services.ecs.MachineImageType] = None,
    taskDrainTime: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions =
    (new software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder)
      .spotInstanceDraining(spotInstanceDraining.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .canContainersAccessInstanceRole(canContainersAccessInstanceRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .topicEncryptionKey(topicEncryptionKey.orNull)
      .machineImageType(machineImageType.orNull)
      .taskDrainTime(taskDrainTime.orNull)
      .build()
}
