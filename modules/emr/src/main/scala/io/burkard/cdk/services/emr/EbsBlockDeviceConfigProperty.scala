package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbsBlockDeviceConfigProperty {

  def apply(
    volumesPerInstance: Option[Number] = None,
    volumeSpecification: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder)
      .volumesPerInstance(volumesPerInstance.orNull)
      .volumeSpecification(volumeSpecification.orNull)
      .build()
}
