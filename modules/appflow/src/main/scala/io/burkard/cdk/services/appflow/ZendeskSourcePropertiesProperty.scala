package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ZendeskSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
