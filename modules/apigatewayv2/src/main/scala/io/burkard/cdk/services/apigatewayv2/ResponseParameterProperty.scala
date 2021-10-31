package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseParameterProperty {

  def apply(
    source: Option[String] = None,
    destination: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegration.ResponseParameterProperty.Builder)
      .source(source.orNull)
      .destination(destination.orNull)
      .build()
}
