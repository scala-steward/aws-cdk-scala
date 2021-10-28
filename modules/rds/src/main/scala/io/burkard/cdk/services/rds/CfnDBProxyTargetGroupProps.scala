package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBProxyTargetGroupProps {

  def apply(
    connectionPoolConfigurationInfo: Option[software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty] = None,
    dbInstanceIdentifiers: Option[List[String]] = None,
    targetGroupName: Option[String] = None,
    dbClusterIdentifiers: Option[List[String]] = None,
    dbProxyName: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps.Builder)
      .connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.orNull)
      .dbInstanceIdentifiers(dbInstanceIdentifiers.map(_.asJava).orNull)
      .targetGroupName(targetGroupName.orNull)
      .dbClusterIdentifiers(dbClusterIdentifiers.map(_.asJava).orNull)
      .dbProxyName(dbProxyName.orNull)
      .build()
}