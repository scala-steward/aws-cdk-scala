package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDynamicReferenceProps {

  def apply(
    referenceKey: Option[String] = None,
    service: Option[software.amazon.awscdk.CfnDynamicReferenceService] = None
  ): software.amazon.awscdk.CfnDynamicReferenceProps =
    (new software.amazon.awscdk.CfnDynamicReferenceProps.Builder)
      .referenceKey(referenceKey.orNull)
      .service(service.orNull)
      .build()
}
