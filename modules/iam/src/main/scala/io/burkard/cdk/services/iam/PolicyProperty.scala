package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyProperty {

  def apply(
    policyName: Option[String] = None,
    policyDocument: Option[AnyRef] = None
  ): software.amazon.awscdk.services.iam.CfnRole.PolicyProperty =
    (new software.amazon.awscdk.services.iam.CfnRole.PolicyProperty.Builder)
      .policyName(policyName.orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
