package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationSettingsProperty {

  def apply(
    settingsGroup: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty =
    (new software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder)
      .settingsGroup(settingsGroup.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
