package io.burkard.cdk.services.pinpointemail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TagsProperty]] = None,
    reputationOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty] = None,
    trackingOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.TrackingOptionsProperty] = None,
    sendingOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.SendingOptionsProperty] = None,
    deliveryOptions: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.DeliveryOptionsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet =
    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .reputationOptions(reputationOptions.orNull)
      .trackingOptions(trackingOptions.orNull)
      .sendingOptions(sendingOptions.orNull)
      .deliveryOptions(deliveryOptions.orNull)
      .build()
}
