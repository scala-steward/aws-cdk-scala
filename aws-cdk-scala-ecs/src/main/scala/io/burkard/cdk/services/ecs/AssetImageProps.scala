package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetImageProps {

  def apply(
    buildArgs: Option[Map[String, String]] = None,
    invalidation: Option[software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions] = None,
    extraHash: Option[String] = None,
    followSymlinks: Option[software.amazon.awscdk.SymlinkFollowMode] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    file: Option[String] = None,
    target: Option[String] = None,
    exclude: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.AssetImageProps =
    (new software.amazon.awscdk.services.ecs.AssetImageProps.Builder)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .invalidation(invalidation.orNull)
      .extraHash(extraHash.orNull)
      .followSymlinks(followSymlinks.orNull)
      .ignoreMode(ignoreMode.orNull)
      .file(file.orNull)
      .target(target.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .build()
}
