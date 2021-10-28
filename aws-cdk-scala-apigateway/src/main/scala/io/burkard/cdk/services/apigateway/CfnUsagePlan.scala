package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUsagePlan {

  def apply(
    internalResourceId: String,
    quota: Option[software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty] = None,
    usagePlanName: Option[String] = None,
    apiStages: Option[List[_]] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnUsagePlan =
    software.amazon.awscdk.services.apigateway.CfnUsagePlan.Builder
      .create(stackCtx, internalResourceId)
      .quota(quota.orNull)
      .usagePlanName(usagePlanName.orNull)
      .apiStages(apiStages.map(_.asJava).orNull)
      .throttle(throttle.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
