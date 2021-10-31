package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecondaryIndexProps {

  def apply(
    projectionType: Option[software.amazon.awscdk.services.dynamodb.ProjectionType] = None,
    nonKeyAttributes: Option[List[String]] = None,
    indexName: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.SecondaryIndexProps =
    (new software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder)
      .projectionType(projectionType.orNull)
      .nonKeyAttributes(nonKeyAttributes.map(_.asJava).orNull)
      .indexName(indexName.orNull)
      .build()
}
