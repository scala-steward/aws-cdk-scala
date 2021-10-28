package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseProxyAttributes {

  def apply(
    dbProxyArn: Option[String] = None,
    dbProxyName: Option[String] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.rds.DatabaseProxyAttributes =
    (new software.amazon.awscdk.services.rds.DatabaseProxyAttributes.Builder)
      .dbProxyArn(dbProxyArn.orNull)
      .dbProxyName(dbProxyName.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .endpoint(endpoint.orNull)
      .build()
}
