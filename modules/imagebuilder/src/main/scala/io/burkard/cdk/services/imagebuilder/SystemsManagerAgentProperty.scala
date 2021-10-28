package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SystemsManagerAgentProperty {

  def apply(
    uninstallAfterBuild: Option[Boolean] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImageRecipe.SystemsManagerAgentProperty.Builder)
      .uninstallAfterBuild(uninstallAfterBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}