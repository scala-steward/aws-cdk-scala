package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TriggerProperty {

  def apply(
    triggeringDataset: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty] = None,
    schedule: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder)
      .triggeringDataset(triggeringDataset.orNull)
      .schedule(schedule.orNull)
      .build()
}