package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MarketoSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
