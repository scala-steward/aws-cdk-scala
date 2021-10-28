package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CorsConfigurationObjectProperty {

  def apply(
    allowHeaders: Option[String] = None,
    allowOrigin: Option[String] = None,
    exposeHeaders: Option[List[String]] = None,
    allowCredentials: Option[Boolean] = None,
    allowMethods: Option[String] = None,
    maxAge: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty.Builder)
      .allowHeaders(allowHeaders.orNull)
      .allowOrigin(allowOrigin.orNull)
      .exposeHeaders(exposeHeaders.map(_.asJava).orNull)
      .allowCredentials(allowCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allowMethods(allowMethods.orNull)
      .maxAge(maxAge.orNull)
      .build()
}
