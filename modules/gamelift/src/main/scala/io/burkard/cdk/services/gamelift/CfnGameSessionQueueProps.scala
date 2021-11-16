package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGameSessionQueueProps {

  def apply(
    name: String,
    timeoutInSeconds: Option[Number] = None,
    customEventData: Option[String] = None,
    destinations: Option[List[_]] = None,
    priorityConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty] = None,
    filterConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty] = None,
    notificationTarget: Option[String] = None,
    playerLatencyPolicies: Option[List[_]] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps =
    (new software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps.Builder)
      .name(name)
      .timeoutInSeconds(timeoutInSeconds.orNull)
      .customEventData(customEventData.orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .priorityConfiguration(priorityConfiguration.orNull)
      .filterConfiguration(filterConfiguration.orNull)
      .notificationTarget(notificationTarget.orNull)
      .playerLatencyPolicies(playerLatencyPolicies.map(_.asJava).orNull)
      .build()
}
