package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventInvokeDestinationConfigProperty {

  def apply(
    onSuccess: Option[software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty] = None,
    onFailure: Option[software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty.Builder)
      .onSuccess(onSuccess.orNull)
      .onFailure(onFailure.orNull)
      .build()
}