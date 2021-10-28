package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProxyResourceProps {

  def apply(
    parent: Option[software.amazon.awscdk.services.apigateway.IResource] = None,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    anyMethod: Option[Boolean] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  ): software.amazon.awscdk.services.apigateway.ProxyResourceProps =
    (new software.amazon.awscdk.services.apigateway.ProxyResourceProps.Builder)
      .parent(parent.orNull)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .anyMethod(anyMethod.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}