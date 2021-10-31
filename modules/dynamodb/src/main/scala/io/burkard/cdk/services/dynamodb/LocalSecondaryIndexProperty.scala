package io.burkard.cdk.services.dynamodb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LocalSecondaryIndexProperty {

  def apply(
    projection: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty] = None,
    indexName: Option[String] = None,
    keySchema: Option[List[_]] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder)
      .projection(projection.orNull)
      .indexName(indexName.orNull)
      .keySchema(keySchema.map(_.asJava).orNull)
      .build()
}
