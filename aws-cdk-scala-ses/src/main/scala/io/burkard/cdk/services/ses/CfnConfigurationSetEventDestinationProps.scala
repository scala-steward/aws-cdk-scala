package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationSetEventDestinationProps {

  def apply(
    configurationSetName: Option[String] = None,
    eventDestination: Option[software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty] = None
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps.Builder)
      .configurationSetName(configurationSetName.orNull)
      .eventDestination(eventDestination.orNull)
      .build()
}
