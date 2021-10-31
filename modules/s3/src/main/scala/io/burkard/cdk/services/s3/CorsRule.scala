package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CorsRule {

  def apply(
    allowedMethods: Option[List[_ <: software.amazon.awscdk.services.s3.HttpMethods]] = None,
    exposedHeaders: Option[List[String]] = None,
    id: Option[String] = None,
    allowedHeaders: Option[List[String]] = None,
    maxAge: Option[Number] = None,
    allowedOrigins: Option[List[String]] = None
  ): software.amazon.awscdk.services.s3.CorsRule =
    (new software.amazon.awscdk.services.s3.CorsRule.Builder)
      .allowedMethods(allowedMethods.map(_.asJava).orNull)
      .exposedHeaders(exposedHeaders.map(_.asJava).orNull)
      .id(id.orNull)
      .allowedHeaders(allowedHeaders.map(_.asJava).orNull)
      .maxAge(maxAge.orNull)
      .allowedOrigins(allowedOrigins.map(_.asJava).orNull)
      .build()
}
