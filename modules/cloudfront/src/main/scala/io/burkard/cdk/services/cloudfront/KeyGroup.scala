package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyGroup {

  def apply(
    internalResourceId: String,
    items: Option[List[_ <: software.amazon.awscdk.services.cloudfront.IPublicKey]] = None,
    comment: Option[String] = None,
    keyGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.KeyGroup =
    software.amazon.awscdk.services.cloudfront.KeyGroup.Builder
      .create(stackCtx, internalResourceId)
      .items(items.map(_.asJava).orNull)
      .comment(comment.orNull)
      .keyGroupName(keyGroupName.orNull)
      .build()
}
