package io.burkard.cdk.services.synthetics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCanaryProps {

  def apply(
    visualReference: Option[software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty] = None,
    failureRetentionPeriod: Option[Number] = None,
    vpcConfig: Option[software.amazon.awscdk.services.synthetics.CfnCanary.VPCConfigProperty] = None,
    startCanaryAfterCreation: Option[Boolean] = None,
    name: Option[String] = None,
    artifactS3Location: Option[String] = None,
    successRetentionPeriod: Option[Number] = None,
    runConfig: Option[software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    code: Option[software.amazon.awscdk.services.synthetics.CfnCanary.CodeProperty] = None,
    runtimeVersion: Option[String] = None,
    executionRoleArn: Option[String] = None,
    schedule: Option[software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanaryProps =
    (new software.amazon.awscdk.services.synthetics.CfnCanaryProps.Builder)
      .visualReference(visualReference.orNull)
      .failureRetentionPeriod(failureRetentionPeriod.orNull)
      .vpcConfig(vpcConfig.orNull)
      .startCanaryAfterCreation(startCanaryAfterCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .name(name.orNull)
      .artifactS3Location(artifactS3Location.orNull)
      .successRetentionPeriod(successRetentionPeriod.orNull)
      .runConfig(runConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .code(code.orNull)
      .runtimeVersion(runtimeVersion.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .schedule(schedule.orNull)
      .build()
}
