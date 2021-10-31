package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputArtifactProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder)
      .name(name.orNull)
      .build()
}
