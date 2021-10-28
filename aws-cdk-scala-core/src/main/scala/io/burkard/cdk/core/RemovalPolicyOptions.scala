package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RemovalPolicyOptions {

  def apply(
    applyToUpdateReplacePolicy: Option[Boolean] = None,
    defaultValue: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.RemovalPolicyOptions =
    (new software.amazon.awscdk.RemovalPolicyOptions.Builder)
      .applyToUpdateReplacePolicy(applyToUpdateReplacePolicy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultValue(defaultValue.orNull)
      .build()
}
