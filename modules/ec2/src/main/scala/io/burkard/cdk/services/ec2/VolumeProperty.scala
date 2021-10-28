package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VolumeProperty {

  def apply(
    volumeId: Option[String] = None,
    device: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty.Builder)
      .volumeId(volumeId.orNull)
      .device(device.orNull)
      .build()
}