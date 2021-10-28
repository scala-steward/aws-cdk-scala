package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInsightRule {

  def apply(
    internalResourceId: String,
    ruleName: Option[String] = None,
    tags: Option[List[_]] = None,
    ruleBody: Option[String] = None,
    ruleState: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CfnInsightRule =
    software.amazon.awscdk.services.cloudwatch.CfnInsightRule.Builder
      .create(stackCtx, internalResourceId)
      .ruleName(ruleName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .ruleBody(ruleBody.orNull)
      .ruleState(ruleState.orNull)
      .build()
}
