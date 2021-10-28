package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MsSmoothOutputSettingsProperty {

  def apply(
    h265PackagingType: Option[String] = None,
    nameModifier: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MsSmoothOutputSettingsProperty.Builder)
      .h265PackagingType(h265PackagingType.orNull)
      .nameModifier(nameModifier.orNull)
      .build()
}
