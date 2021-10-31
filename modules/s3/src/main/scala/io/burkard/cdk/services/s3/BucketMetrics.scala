package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BucketMetrics {

  def apply(
    tagFilters: Option[Map[String, _]] = None,
    prefix: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.s3.BucketMetrics =
    (new software.amazon.awscdk.services.s3.BucketMetrics.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .id(id.orNull)
      .build()
}
