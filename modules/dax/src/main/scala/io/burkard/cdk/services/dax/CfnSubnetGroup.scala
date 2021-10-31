package io.burkard.cdk.services.dax

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    subnetGroupName: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dax.CfnSubnetGroup =
    software.amazon.awscdk.services.dax.CfnSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .subnetGroupName(subnetGroupName.orNull)
      .description(description.orNull)
      .build()
}
