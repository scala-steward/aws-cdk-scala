package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModuleDefaultVersionProps {

  def apply(
    arn: Option[String] = None,
    versionId: Option[String] = None,
    moduleName: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps =
    (new software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps.Builder)
      .arn(arn.orNull)
      .versionId(versionId.orNull)
      .moduleName(moduleName.orNull)
      .build()
}
