package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationConfiguration {

  def apply(
    scalingEvents: Option[software.amazon.awscdk.services.autoscaling.ScalingEvents] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.autoscaling.NotificationConfiguration =
    (new software.amazon.awscdk.services.autoscaling.NotificationConfiguration.Builder)
      .scalingEvents(scalingEvents.orNull)
      .topic(topic.orNull)
      .build()
}
