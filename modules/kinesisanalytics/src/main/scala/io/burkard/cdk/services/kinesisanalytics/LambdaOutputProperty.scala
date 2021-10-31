package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaOutputProperty {

  def apply(
    resourceArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder)
      .resourceArn(resourceArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
