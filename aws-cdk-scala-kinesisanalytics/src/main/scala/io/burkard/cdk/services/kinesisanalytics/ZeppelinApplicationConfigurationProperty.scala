package io.burkard.cdk.services.kinesisanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ZeppelinApplicationConfigurationProperty {

  def apply(
    deployAsApplicationConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty] = None,
    monitoringConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty] = None,
    catalogConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty] = None,
    customArtifactsConfiguration: Option[List[_]] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty.Builder)
      .deployAsApplicationConfiguration(deployAsApplicationConfiguration.orNull)
      .monitoringConfiguration(monitoringConfiguration.orNull)
      .catalogConfiguration(catalogConfiguration.orNull)
      .customArtifactsConfiguration(customArtifactsConfiguration.map(_.asJava).orNull)
      .build()
}
