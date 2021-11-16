package io.burkard.cdk.services.servicecatalogappregistry

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    name: String,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalogappregistry.CfnApplication =
    software.amazon.awscdk.services.servicecatalogappregistry.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
