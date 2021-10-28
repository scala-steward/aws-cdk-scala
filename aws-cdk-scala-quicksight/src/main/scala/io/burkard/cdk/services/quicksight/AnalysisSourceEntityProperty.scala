package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AnalysisSourceEntityProperty {

  def apply(
    sourceTemplate: Option[software.amazon.awscdk.services.quicksight.CfnAnalysis.AnalysisSourceTemplateProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnAnalysis.AnalysisSourceEntityProperty =
    (new software.amazon.awscdk.services.quicksight.CfnAnalysis.AnalysisSourceEntityProperty.Builder)
      .sourceTemplate(sourceTemplate.orNull)
      .build()
}
