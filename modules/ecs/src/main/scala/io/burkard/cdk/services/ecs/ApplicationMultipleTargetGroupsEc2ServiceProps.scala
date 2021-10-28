package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationMultipleTargetGroupsEc2ServiceProps {

  def apply(
    memoryLimitMiB: Option[Number] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    desiredCount: Option[Number] = None,
    loadBalancers: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps]] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    cpu: Option[Number] = None,
    taskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps]] = None,
    serviceName: Option[String] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.Ec2TaskDefinition] = None,
    memoryReservationMiB: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps.Builder)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .desiredCount(desiredCount.orNull)
      .loadBalancers(loadBalancers.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .cpu(cpu.orNull)
      .taskImageOptions(taskImageOptions.orNull)
      .vpc(vpc.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .serviceName(serviceName.orNull)
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .taskDefinition(taskDefinition.orNull)
      .memoryReservationMiB(memoryReservationMiB.orNull)
      .build()
}