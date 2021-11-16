package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LabelMatchStatementProperty {

  def apply(
    scope: String,
    key: String
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty.Builder)
      .scope(scope)
      .key(key)
      .build()
}
