package io.burkard.cdk.services.autoscaling

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RequestCountScalingProps {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    targetRequestsPerSecond: Option[Number] = None,
    targetRequestsPerMinute: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.RequestCountScalingProps =
    (new software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .targetRequestsPerSecond(targetRequestsPerSecond.orNull)
      .targetRequestsPerMinute(targetRequestsPerMinute.orNull)
      .build()
}
