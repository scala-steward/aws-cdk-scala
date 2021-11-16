package io.burkard.cdk.services.docdb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBSubnetGroupProps {

  def apply(
    subnetIds: List[String],
    dbSubnetGroupDescription: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dbSubnetGroupName: Option[String] = None
  ): software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps =
    (new software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder)
      .subnetIds(subnetIds.asJava)
      .dbSubnetGroupDescription(dbSubnetGroupDescription)
      .tags(tags.map(_.asJava).orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .build()
}
