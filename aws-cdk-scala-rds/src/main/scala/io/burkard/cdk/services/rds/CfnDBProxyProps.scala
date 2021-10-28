package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBProxyProps {

  def apply(
    auth: Option[List[_]] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty]] = None,
    vpcSubnetIds: Option[List[String]] = None,
    engineFamily: Option[String] = None,
    debugLogging: Option[Boolean] = None,
    roleArn: Option[String] = None,
    requireTls: Option[Boolean] = None,
    dbProxyName: Option[String] = None,
    idleClientTimeout: Option[Number] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyProps =
    (new software.amazon.awscdk.services.rds.CfnDBProxyProps.Builder)
      .auth(auth.map(_.asJava).orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcSubnetIds(vpcSubnetIds.map(_.asJava).orNull)
      .engineFamily(engineFamily.orNull)
      .debugLogging(debugLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .roleArn(roleArn.orNull)
      .requireTls(requireTls.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbProxyName(dbProxyName.orNull)
      .idleClientTimeout(idleClientTimeout.orNull)
      .build()
}
