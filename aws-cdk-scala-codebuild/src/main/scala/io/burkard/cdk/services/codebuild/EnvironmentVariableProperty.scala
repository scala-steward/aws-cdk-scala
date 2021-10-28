package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EnvironmentVariableProperty {

  def apply(
    name: Option[String] = None,
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
