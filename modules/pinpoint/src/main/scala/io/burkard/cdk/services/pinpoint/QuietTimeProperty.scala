package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QuietTimeProperty {

  def apply(
    end: Option[String] = None,
    start: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty.Builder)
      .end(end.orNull)
      .start(start.orNull)
      .build()
}
