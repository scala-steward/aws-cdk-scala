package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSAMLProviderProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    samlMetadataDocument: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnSAMLProviderProps =
    (new software.amazon.awscdk.services.iam.CfnSAMLProviderProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .samlMetadataDocument(samlMetadataDocument.orNull)
      .build()
}
