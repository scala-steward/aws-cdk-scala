package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringInputProperty {

  def apply(
    endpointInput: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty.Builder)
      .endpointInput(endpointInput.orNull)
      .build()
}
