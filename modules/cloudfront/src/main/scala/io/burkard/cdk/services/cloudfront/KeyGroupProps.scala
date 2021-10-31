package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyGroupProps {

  def apply(
    items: Option[List[_ <: software.amazon.awscdk.services.cloudfront.IPublicKey]] = None,
    comment: Option[String] = None,
    keyGroupName: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.KeyGroupProps =
    (new software.amazon.awscdk.services.cloudfront.KeyGroupProps.Builder)
      .items(items.map(_.asJava).orNull)
      .comment(comment.orNull)
      .keyGroupName(keyGroupName.orNull)
      .build()
}
