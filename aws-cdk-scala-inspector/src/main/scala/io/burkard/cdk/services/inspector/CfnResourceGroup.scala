package io.burkard.cdk.services.inspector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceGroup {

  def apply(
    internalResourceId: String,
    resourceGroupTags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.inspector.CfnResourceGroup =
    software.amazon.awscdk.services.inspector.CfnResourceGroup.Builder
      .create(stackCtx, internalResourceId)
      .resourceGroupTags(resourceGroupTags.map(_.asJava).orNull)
      .build()
}
