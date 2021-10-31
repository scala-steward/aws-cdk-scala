package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnProperty {

  def apply(
    name: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .build()
}
