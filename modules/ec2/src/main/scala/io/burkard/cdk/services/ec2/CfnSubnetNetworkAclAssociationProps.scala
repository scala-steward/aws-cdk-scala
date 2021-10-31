package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetNetworkAclAssociationProps {

  def apply(
    networkAclId: Option[String] = None,
    subnetId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps.Builder)
      .networkAclId(networkAclId.orNull)
      .subnetId(subnetId.orNull)
      .build()
}
