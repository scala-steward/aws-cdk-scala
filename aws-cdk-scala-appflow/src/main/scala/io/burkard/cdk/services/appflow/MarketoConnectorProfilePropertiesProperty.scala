package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MarketoConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl.orNull)
      .build()
}
