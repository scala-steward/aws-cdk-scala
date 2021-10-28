package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterProperty {

  def apply(
    parameterKey: Option[String] = None,
    parameterValue: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty =
    (new software.amazon.awscdk.services.cloudformation.CfnStackSet.ParameterProperty.Builder)
      .parameterKey(parameterKey.orNull)
      .parameterValue(parameterValue.orNull)
      .build()
}