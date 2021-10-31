package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoverycontrol.CfnCluster =
    software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .build()
}
