package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FixedResponseConfigProperty {

  def apply(
    statusCode: Option[String] = None,
    messageBody: Option[String] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty.Builder)
      .statusCode(statusCode.orNull)
      .messageBody(messageBody.orNull)
      .contentType(contentType.orNull)
      .build()
}