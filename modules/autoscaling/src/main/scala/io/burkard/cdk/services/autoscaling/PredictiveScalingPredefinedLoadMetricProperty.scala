package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredictiveScalingPredefinedLoadMetricProperty {

  def apply(
    predefinedMetricType: Option[String] = None,
    resourceLabel: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.Builder)
      .predefinedMetricType(predefinedMetricType.orNull)
      .resourceLabel(resourceLabel.orNull)
      .build()
}
