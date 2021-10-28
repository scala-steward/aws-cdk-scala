package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NodeConfigurationProperty {

  def apply(
    availabilityZone: Option[String] = None,
    instanceType: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .instanceType(instanceType.orNull)
      .build()
}