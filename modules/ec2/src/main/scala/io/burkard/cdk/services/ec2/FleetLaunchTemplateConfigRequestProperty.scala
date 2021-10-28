package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FleetLaunchTemplateConfigRequestProperty {

  def apply(
    launchTemplateSpecification: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty] = None,
    overrides: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.Builder)
      .launchTemplateSpecification(launchTemplateSpecification.orNull)
      .overrides(overrides.map(_.asJava).orNull)
      .build()
}