package io.burkard.cdk.services.sns

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UrlSubscription {

  def apply(
    url: String,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None,
    protocol: Option[software.amazon.awscdk.services.sns.SubscriptionProtocol] = None
  ): software.amazon.awscdk.services.sns.subscriptions.UrlSubscription =
    software.amazon.awscdk.services.sns.subscriptions.UrlSubscription.Builder
      .create(url)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}