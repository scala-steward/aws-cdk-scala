package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EnvironmentVariableProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty =
    (new software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
