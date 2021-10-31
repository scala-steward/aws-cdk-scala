package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReportPlan {

  def apply(
    internalResourceId: String,
    reportSetting: Option[AnyRef] = None,
    reportDeliveryChannel: Option[AnyRef] = None,
    reportPlanName: Option[String] = None,
    reportPlanDescription: Option[String] = None,
    reportPlanTags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnReportPlan =
    software.amazon.awscdk.services.backup.CfnReportPlan.Builder
      .create(stackCtx, internalResourceId)
      .reportSetting(reportSetting.orNull)
      .reportDeliveryChannel(reportDeliveryChannel.orNull)
      .reportPlanName(reportPlanName.orNull)
      .reportPlanDescription(reportPlanDescription.orNull)
      .reportPlanTags(reportPlanTags.map(_.asJava).orNull)
      .build()
}
