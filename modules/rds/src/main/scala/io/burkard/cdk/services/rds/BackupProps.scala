package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupProps {

  def apply(
    retention: Option[software.amazon.awscdk.Duration] = None,
    preferredWindow: Option[String] = None
  ): software.amazon.awscdk.services.rds.BackupProps =
    (new software.amazon.awscdk.services.rds.BackupProps.Builder)
      .retention(retention.orNull)
      .preferredWindow(preferredWindow.orNull)
      .build()
}
