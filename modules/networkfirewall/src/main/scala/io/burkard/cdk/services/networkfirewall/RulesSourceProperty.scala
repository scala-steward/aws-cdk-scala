package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RulesSourceProperty {

  def apply(
    rulesSourceList: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceListProperty] = None,
    statelessRulesAndCustomActions: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRulesAndCustomActionsProperty] = None,
    rulesString: Option[String] = None,
    statefulRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty.Builder)
      .rulesSourceList(rulesSourceList.orNull)
      .statelessRulesAndCustomActions(statelessRulesAndCustomActions.orNull)
      .rulesString(rulesString.orNull)
      .statefulRules(statefulRules.map(_.asJava).orNull)
      .build()
}