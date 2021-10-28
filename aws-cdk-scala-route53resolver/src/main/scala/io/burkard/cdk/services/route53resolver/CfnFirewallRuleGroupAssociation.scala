package io.burkard.cdk.services.route53resolver

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallRuleGroupAssociation {

  def apply(
    internalResourceId: String,
    mutationProtection: Option[String] = None,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    firewallRuleGroupId: Option[String] = None,
    name: Option[String] = None,
    priority: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation =
    software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation.Builder
      .create(stackCtx, internalResourceId)
      .mutationProtection(mutationProtection.orNull)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .firewallRuleGroupId(firewallRuleGroupId.orNull)
      .name(name.orNull)
      .priority(priority.orNull)
      .build()
}
