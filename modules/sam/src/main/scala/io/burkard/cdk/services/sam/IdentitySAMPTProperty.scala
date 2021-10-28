package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IdentitySAMPTProperty {

  def apply(
    identityName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty.Builder)
      .identityName(identityName.orNull)
      .build()
}