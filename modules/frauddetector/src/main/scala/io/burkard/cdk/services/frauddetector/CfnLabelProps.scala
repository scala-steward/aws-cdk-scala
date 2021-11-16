package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLabelProps {

  def apply(
    name: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnLabelProps =
    (new software.amazon.awscdk.services.frauddetector.CfnLabelProps.Builder)
      .name(name)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
