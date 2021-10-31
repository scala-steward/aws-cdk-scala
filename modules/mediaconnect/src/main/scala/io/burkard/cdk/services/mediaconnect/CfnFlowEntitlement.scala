package io.burkard.cdk.services.mediaconnect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowEntitlement {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    subscribers: Option[List[String]] = None,
    description: Option[String] = None,
    dataTransferSubscriberFeePercent: Option[Number] = None,
    encryption: Option[software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty] = None,
    flowArn: Option[String] = None,
    entitlementStatus: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement =
    software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .subscribers(subscribers.map(_.asJava).orNull)
      .description(description.orNull)
      .dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent.orNull)
      .encryption(encryption.orNull)
      .flowArn(flowArn.orNull)
      .entitlementStatus(entitlementStatus.orNull)
      .build()
}
