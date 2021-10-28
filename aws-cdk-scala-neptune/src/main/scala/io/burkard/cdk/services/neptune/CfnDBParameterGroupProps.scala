package io.burkard.cdk.services.neptune

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBParameterGroupProps {

  def apply(
    name: Option[String] = None,
    family: Option[String] = None,
    parameters: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps =
    (new software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder)
      .name(name.orNull)
      .family(family.orNull)
      .parameters(parameters.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
