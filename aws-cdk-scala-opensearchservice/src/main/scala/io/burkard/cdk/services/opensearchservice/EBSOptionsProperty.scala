package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EBSOptionsProperty {

  def apply(
    volumeType: Option[String] = None,
    ebsEnabled: Option[Boolean] = None,
    iops: Option[Number] = None,
    volumeSize: Option[Number] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty.Builder)
      .volumeType(volumeType.orNull)
      .ebsEnabled(ebsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .volumeSize(volumeSize.orNull)
      .build()
}
