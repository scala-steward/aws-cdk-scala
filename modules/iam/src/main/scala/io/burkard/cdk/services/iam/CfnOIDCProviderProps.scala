package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOIDCProviderProps {

  def apply(
    url: Option[String] = None,
    thumbprintList: Option[List[String]] = None,
    clientIdList: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iam.CfnOIDCProviderProps =
    (new software.amazon.awscdk.services.iam.CfnOIDCProviderProps.Builder)
      .url(url.orNull)
      .thumbprintList(thumbprintList.map(_.asJava).orNull)
      .clientIdList(clientIdList.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
