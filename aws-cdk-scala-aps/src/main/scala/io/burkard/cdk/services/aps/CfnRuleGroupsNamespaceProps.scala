package io.burkard.cdk.services.aps

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRuleGroupsNamespaceProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    data: Option[String] = None,
    workspace: Option[String] = None
  ): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps =
    (new software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .data(data.orNull)
      .workspace(workspace.orNull)
      .build()
}
