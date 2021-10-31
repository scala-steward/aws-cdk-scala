package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsOrgProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.AwsOrgProperty.Builder)
      .arn(arn.orNull)
      .build()
}
