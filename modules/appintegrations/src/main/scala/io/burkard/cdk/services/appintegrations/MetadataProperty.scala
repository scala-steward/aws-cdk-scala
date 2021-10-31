package io.burkard.cdk.services.appintegrations

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetadataProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.appintegrations.CfnEventIntegration.MetadataProperty =
    (new software.amazon.awscdk.services.appintegrations.CfnEventIntegration.MetadataProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
