package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3TableOutputOptionsProperty {

  def apply(
    location: Option[software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty.Builder)
      .location(location.orNull)
      .build()
}