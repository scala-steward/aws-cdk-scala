package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateProperty {

  def apply(
    launchTemplateName: Option[String] = None,
    launchTemplateId: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty.Builder)
      .launchTemplateName(launchTemplateName.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .version(version.orNull)
      .build()
}
