package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceTypeConfigProperty {

  def apply(
    ebsConfiguration: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty] = None,
    bidPriceAsPercentageOfOnDemandPrice: Option[Number] = None,
    weightedCapacity: Option[Number] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty]] = None,
    bidPrice: Option[String] = None,
    instanceType: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.Builder)
      .ebsConfiguration(ebsConfiguration.orNull)
      .bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .bidPrice(bidPrice.orNull)
      .instanceType(instanceType.orNull)
      .build()
}
