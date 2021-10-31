package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StoppingConditionProperty {

  def apply(
    maxRuntimeInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty.Builder)
      .maxRuntimeInSeconds(maxRuntimeInSeconds.orNull)
      .build()
}
