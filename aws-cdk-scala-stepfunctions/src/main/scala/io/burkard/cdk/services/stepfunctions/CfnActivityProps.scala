package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnActivityProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty]] = None
  ): software.amazon.awscdk.services.stepfunctions.CfnActivityProps =
    (new software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
