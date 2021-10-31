package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebACLProps {

  def apply(
    customResponseBodies: Option[Map[String, _]] = None,
    defaultAction: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.DefaultActionProperty] = None,
    rules: Option[List[_]] = None,
    name: Option[String] = None,
    visibilityConfig: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.VisibilityConfigProperty] = None,
    description: Option[String] = None,
    scope: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACLProps =
    (new software.amazon.awscdk.services.wafv2.CfnWebACLProps.Builder)
      .customResponseBodies(customResponseBodies.map(_.asJava).orNull)
      .defaultAction(defaultAction.orNull)
      .rules(rules.map(_.asJava).orNull)
      .name(name.orNull)
      .visibilityConfig(visibilityConfig.orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
