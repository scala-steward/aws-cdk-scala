package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentSourceContext {

  def apply(
    handlerRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext =
    (new software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext.Builder)
      .handlerRole(handlerRole.orNull)
      .build()
}
