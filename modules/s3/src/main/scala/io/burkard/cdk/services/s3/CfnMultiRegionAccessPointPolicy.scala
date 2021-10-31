package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMultiRegionAccessPointPolicy {

  def apply(
    internalResourceId: String,
    mrapName: Option[String] = None,
    policy: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy =
    software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.Builder
      .create(stackCtx, internalResourceId)
      .mrapName(mrapName.orNull)
      .policy(policy.orNull)
      .build()
}
