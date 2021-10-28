package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FilterProperty {

  def apply(
    name: Option[String] = None,
    filter: Option[String] = None,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder)
      .name(name.orNull)
      .filter(filter.orNull)
      .next(next.orNull)
      .build()
}
