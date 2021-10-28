package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UsagePlan {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    quota: Option[software.amazon.awscdk.services.apigateway.QuotaSettings] = None,
    description: Option[String] = None,
    apiStages: Option[List[_ <: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage]] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.ThrottleSettings] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.UsagePlan =
    software.amazon.awscdk.services.apigateway.UsagePlan.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .quota(quota.orNull)
      .description(description.orNull)
      .apiStages(apiStages.map(_.asJava).orNull)
      .throttle(throttle.orNull)
      .build()
}
