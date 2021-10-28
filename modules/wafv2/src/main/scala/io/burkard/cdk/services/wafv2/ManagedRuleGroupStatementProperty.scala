package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ManagedRuleGroupStatementProperty {

  def apply(
    name: Option[String] = None,
    scopeDownStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty] = None,
    vendorName: Option[String] = None,
    version: Option[String] = None,
    excludedRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty.Builder)
      .name(name.orNull)
      .scopeDownStatement(scopeDownStatement.orNull)
      .vendorName(vendorName.orNull)
      .version(version.orNull)
      .excludedRules(excludedRules.map(_.asJava).orNull)
      .build()
}