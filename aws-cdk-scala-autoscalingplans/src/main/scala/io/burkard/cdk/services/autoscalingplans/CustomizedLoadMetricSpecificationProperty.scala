package io.burkard.cdk.services.autoscalingplans

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomizedLoadMetricSpecificationProperty {

  def apply(
    statistic: Option[String] = None,
    metricName: Option[String] = None,
    dimensions: Option[List[_]] = None,
    unit: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder)
      .statistic(statistic.orNull)
      .metricName(metricName.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .namespace(namespace.orNull)
      .build()
}
