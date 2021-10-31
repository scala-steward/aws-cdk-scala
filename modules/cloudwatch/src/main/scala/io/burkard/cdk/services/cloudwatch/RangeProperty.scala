package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RangeProperty {

  def apply(
    startTime: Option[String] = None,
    endTime: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty.Builder)
      .startTime(startTime.orNull)
      .endTime(endTime.orNull)
      .build()
}
