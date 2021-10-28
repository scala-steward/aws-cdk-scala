package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationProps {

  def apply(
    description: Option[String] = None,
    applicationName: Option[String] = None,
    resourceLifecycleConfig: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder)
      .description(description.orNull)
      .applicationName(applicationName.orNull)
      .resourceLifecycleConfig(resourceLifecycleConfig.orNull)
      .build()
}