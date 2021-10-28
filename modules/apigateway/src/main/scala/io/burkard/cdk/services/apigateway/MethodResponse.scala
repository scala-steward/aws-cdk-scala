package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MethodResponse {

  def apply(
    statusCode: Option[String] = None,
    responseModels: Option[Map[String, _ <: software.amazon.awscdk.services.apigateway.IModel]] = None,
    responseParameters: Option[Map[String, _ <: Boolean]] = None
  ): software.amazon.awscdk.services.apigateway.MethodResponse =
    (new software.amazon.awscdk.services.apigateway.MethodResponse.Builder)
      .statusCode(statusCode.orNull)
      .responseModels(responseModels.map(_.asJava).orNull)
      .responseParameters(responseParameters.map(_.view.mapValues(Boolean.box).toMap.asJava).orNull)
      .build()
}