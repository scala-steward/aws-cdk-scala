package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RequestValidator {

  def apply(
    internalResourceId: String,
    restApi: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    validateRequestBody: Option[Boolean] = None,
    requestValidatorName: Option[String] = None,
    validateRequestParameters: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.RequestValidator =
    software.amazon.awscdk.services.apigateway.RequestValidator.Builder
      .create(stackCtx, internalResourceId)
      .restApi(restApi.orNull)
      .validateRequestBody(validateRequestBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requestValidatorName(requestValidatorName.orNull)
      .validateRequestParameters(validateRequestParameters.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}