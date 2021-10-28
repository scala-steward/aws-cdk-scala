package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAutoScalingRollingUpdate {

  def apply(
    minSuccessfulInstancesPercent: Option[Number] = None,
    minInstancesInService: Option[Number] = None,
    pauseTime: Option[String] = None,
    suspendProcesses: Option[List[String]] = None,
    maxBatchSize: Option[Number] = None,
    waitOnResourceSignals: Option[Boolean] = None
  ): software.amazon.awscdk.CfnAutoScalingRollingUpdate =
    (new software.amazon.awscdk.CfnAutoScalingRollingUpdate.Builder)
      .minSuccessfulInstancesPercent(minSuccessfulInstancesPercent.orNull)
      .minInstancesInService(minInstancesInService.orNull)
      .pauseTime(pauseTime.orNull)
      .suspendProcesses(suspendProcesses.map(_.asJava).orNull)
      .maxBatchSize(maxBatchSize.orNull)
      .waitOnResourceSignals(waitOnResourceSignals.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
