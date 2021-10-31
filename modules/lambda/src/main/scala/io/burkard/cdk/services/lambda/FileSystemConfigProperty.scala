package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemConfigProperty {

  def apply(
    arn: Option[String] = None,
    localMountPath: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty =
    (new software.amazon.awscdk.services.lambda.CfnFunction.FileSystemConfigProperty.Builder)
      .arn(arn.orNull)
      .localMountPath(localMountPath.orNull)
      .build()
}
