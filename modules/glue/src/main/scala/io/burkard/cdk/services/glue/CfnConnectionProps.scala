package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectionProps {

  def apply(
    connectionInput: Option[software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty] = None,
    catalogId: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnConnectionProps =
    (new software.amazon.awscdk.services.glue.CfnConnectionProps.Builder)
      .connectionInput(connectionInput.orNull)
      .catalogId(catalogId.orNull)
      .build()
}
