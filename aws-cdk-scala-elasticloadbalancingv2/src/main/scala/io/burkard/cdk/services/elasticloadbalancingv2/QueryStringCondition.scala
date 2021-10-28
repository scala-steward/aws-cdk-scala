package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueryStringCondition {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
