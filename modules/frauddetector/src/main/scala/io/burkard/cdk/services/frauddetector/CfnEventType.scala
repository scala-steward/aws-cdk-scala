package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventType {

  def apply(
    internalResourceId: String,
    eventVariables: Option[List[_]] = None,
    name: Option[String] = None,
    labels: Option[List[_]] = None,
    entityTypes: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.frauddetector.CfnEventType =
    software.amazon.awscdk.services.frauddetector.CfnEventType.Builder
      .create(stackCtx, internalResourceId)
      .eventVariables(eventVariables.map(_.asJava).orNull)
      .name(name.orNull)
      .labels(labels.map(_.asJava).orNull)
      .entityTypes(entityTypes.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
