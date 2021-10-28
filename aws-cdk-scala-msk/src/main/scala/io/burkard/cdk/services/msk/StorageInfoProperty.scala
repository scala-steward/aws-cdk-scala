package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StorageInfoProperty {

  def apply(
    ebsStorageInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty.Builder)
      .ebsStorageInfo(ebsStorageInfo.orNull)
      .build()
}
