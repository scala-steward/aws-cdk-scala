package io.burkard.cdk.services.cloudwatch

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricRenderingProperties {

  def apply(
    period: Number,
    color: Option[String] = None,
    stat: Option[String] = None,
    label: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricRenderingProperties =
    (new software.amazon.awscdk.services.cloudwatch.MetricRenderingProperties.Builder)
      .period(period)
      .color(color.orNull)
      .stat(stat.orNull)
      .label(label.orNull)
      .build()
}
