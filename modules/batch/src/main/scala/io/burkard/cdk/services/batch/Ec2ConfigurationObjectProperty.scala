package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2ConfigurationObjectProperty {

  def apply(
    imageIdOverride: Option[String] = None,
    imageType: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty =
    (new software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty.Builder)
      .imageIdOverride(imageIdOverride.orNull)
      .imageType(imageType.orNull)
      .build()
}
