package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InitSourceAssetOptions {

  def apply(
    assetHash: Option[String] = None,
    serviceRestartHandles: Option[List[_ <: software.amazon.awscdk.services.ec2.InitServiceRestartHandle]] = None,
    bundling: Option[software.amazon.awscdk.BundlingOptions] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    assetHashType: Option[software.amazon.awscdk.AssetHashType] = None,
    readers: Option[List[_ <: software.amazon.awscdk.services.iam.IGrantable]] = None
  ): software.amazon.awscdk.services.ec2.InitSourceAssetOptions =
    (new software.amazon.awscdk.services.ec2.InitSourceAssetOptions.Builder)
      .assetHash(assetHash.orNull)
      .serviceRestartHandles(serviceRestartHandles.map(_.asJava).orNull)
      .bundling(bundling.orNull)
      .followSymlinks(followSymlinks.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .assetHashType(assetHashType.orNull)
      .readers(readers.map(_.asJava).orNull)
      .build()
}
