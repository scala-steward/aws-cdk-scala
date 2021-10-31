package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionDrainingPolicyProperty {

  def apply(
    enabled: Option[Boolean] = None,
    timeout: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .timeout(timeout.orNull)
      .build()
}
