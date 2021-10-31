package io.burkard.cdk.services.appintegrations

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventFilterProperty {

  def apply(
    source: Option[String] = None
  ): software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty =
    (new software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty.Builder)
      .source(source.orNull)
      .build()
}
