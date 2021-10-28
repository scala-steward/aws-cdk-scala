package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CopyOptions {

  def apply(
    exclude: Option[List[String]] = None,
    ignoreMode: Option[software.amazon.awscdk.IgnoreMode] = None,
    follow: Option[software.amazon.awscdk.SymlinkFollowMode] = None
  ): software.amazon.awscdk.CopyOptions =
    (new software.amazon.awscdk.CopyOptions.Builder)
      .exclude(exclude.map(_.asJava).orNull)
      .ignoreMode(ignoreMode.orNull)
      .follow(follow.orNull)
      .build()
}