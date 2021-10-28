package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterProperty {

  def apply(
    parameterKey: Option[String] = None,
    parameterValue: Option[String] = None
  ): software.amazon.awscdk.CfnStackSet.ParameterProperty =
    (new software.amazon.awscdk.CfnStackSet.ParameterProperty.Builder)
      .parameterKey(parameterKey.orNull)
      .parameterValue(parameterValue.orNull)
      .build()
}
