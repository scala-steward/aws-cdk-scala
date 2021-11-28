package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CanarySettingProperty {

  def apply(
    percentTraffic: Option[Number] = None,
    stageVariableOverrides: Option[Map[String, String]] = None,
    useStageCache: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty =
    (new software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty.Builder)
      .percentTraffic(percentTraffic.orNull)
      .stageVariableOverrides(stageVariableOverrides.map(_.asJava).orNull)
      .useStageCache(useStageCache.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
