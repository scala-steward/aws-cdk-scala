package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WafActionProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty =
    (new software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}