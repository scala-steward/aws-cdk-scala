package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointAccess {

  def apply(
    internalResourceId: String,
    vpcSecurityGroupIds: List[String],
    endpointName: String,
    subnetGroupName: Option[String] = None,
    clusterIdentifier: Option[String] = None,
    resourceOwner: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.redshift.CfnEndpointAccess =
    software.amazon.awscdk.services.redshift.CfnEndpointAccess.Builder
      .create(stackCtx, internalResourceId)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.asJava)
      .endpointName(endpointName)
      .subnetGroupName(subnetGroupName.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .resourceOwner(resourceOwner.orNull)
      .build()
}
