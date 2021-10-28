package io.burkard.cdk.services.ivs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPlaybackKeyPair {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    publicKeyMaterial: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair =
    software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .publicKeyMaterial(publicKeyMaterial.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}