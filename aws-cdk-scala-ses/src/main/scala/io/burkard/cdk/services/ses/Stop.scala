package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Stop {

  def apply(
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.Stop =
    software.amazon.awscdk.services.ses.actions.Stop.Builder
      .create()
      .topic(topic.orNull)
      .build()
}
