package io.burkard.cdk.services.inspector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceGroupProps {

  def apply(
    resourceGroupTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.inspector.CfnResourceGroupProps =
    (new software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder)
      .resourceGroupTags(resourceGroupTags.map(_.asJava).orNull)
      .build()
}
