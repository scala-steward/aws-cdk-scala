package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RestApiAttributes {

  def apply(
    rootResourceId: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.RestApiAttributes =
    (new software.amazon.awscdk.services.apigateway.RestApiAttributes.Builder)
      .rootResourceId(rootResourceId.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
