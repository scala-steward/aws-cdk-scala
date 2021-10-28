package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnJsonProps {

  def apply(
    value: Option[AnyRef] = None
  ): software.amazon.awscdk.CfnJsonProps =
    (new software.amazon.awscdk.CfnJsonProps.Builder)
      .value(value.orNull)
      .build()
}
