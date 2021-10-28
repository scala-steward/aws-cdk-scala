package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MaintenanceWindowAutomationParametersProperty {

  def apply(
    documentVersion: Option[String] = None,
    parameters: Option[AnyRef] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.Builder)
      .documentVersion(documentVersion.orNull)
      .parameters(parameters.orNull)
      .build()
}
