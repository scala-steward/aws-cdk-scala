package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientVpnAuthorizationRuleOptions {

  def apply(
    cidr: Option[String] = None,
    description: Option[String] = None,
    groupId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions =
    (new software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions.Builder)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .groupId(groupId.orNull)
      .build()
}