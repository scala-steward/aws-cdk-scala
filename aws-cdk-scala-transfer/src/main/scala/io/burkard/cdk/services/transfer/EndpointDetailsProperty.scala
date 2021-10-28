package io.burkard.cdk.services.transfer

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointDetailsProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    addressAllocationIds: Option[List[String]] = None,
    vpcId: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    vpcEndpointId: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty =
    (new software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .addressAllocationIds(addressAllocationIds.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .build()
}
