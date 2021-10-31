package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KafkaSettingsProperty {

  def apply(
    broker: Option[String] = None,
    topic: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.Builder)
      .broker(broker.orNull)
      .topic(topic.orNull)
      .build()
}
