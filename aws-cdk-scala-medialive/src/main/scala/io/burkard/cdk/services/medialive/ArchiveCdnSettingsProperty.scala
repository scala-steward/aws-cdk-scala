package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArchiveCdnSettingsProperty {

  def apply(
    archiveS3Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty.Builder)
      .archiveS3Settings(archiveS3Settings.orNull)
      .build()
}
