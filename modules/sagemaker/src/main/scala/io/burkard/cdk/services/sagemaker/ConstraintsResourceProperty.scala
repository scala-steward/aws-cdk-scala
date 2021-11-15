package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConstraintsResourceProperty {

  def apply(
    s3Uri: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty.Builder)
      .s3Uri(s3Uri.orNull)
      .build()
}
