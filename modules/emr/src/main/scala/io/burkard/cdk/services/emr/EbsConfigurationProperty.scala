package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbsConfigurationProperty {

  def apply(
    ebsOptimized: Option[Boolean] = None,
    ebsBlockDeviceConfigs: Option[List[_]] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.map(_.asJava).orNull)
      .build()
}
