package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomizedLoadMetricSpecificationProperty {

  def apply(
    statistic: String,
    metricName: String,
    namespace: String,
    dimensions: Option[List[_]] = None,
    unit: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder)
      .statistic(statistic)
      .metricName(metricName)
      .namespace(namespace)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .build()
}
