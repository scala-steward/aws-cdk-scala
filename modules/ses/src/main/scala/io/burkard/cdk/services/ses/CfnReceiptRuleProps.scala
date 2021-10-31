package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReceiptRuleProps {

  def apply(
    ruleSetName: Option[String] = None,
    rule: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty] = None,
    after: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRuleProps =
    (new software.amazon.awscdk.services.ses.CfnReceiptRuleProps.Builder)
      .ruleSetName(ruleSetName.orNull)
      .rule(rule.orNull)
      .after(after.orNull)
      .build()
}
