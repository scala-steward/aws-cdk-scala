package io.burkard.cdk.services.lakeformation

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TableWithColumnsResourceProperty {

  def apply(
    name: Option[String] = None,
    columnWildcard: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty] = None,
    columnNames: Option[List[String]] = None,
    catalogId: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty.Builder)
      .name(name.orNull)
      .columnWildcard(columnWildcard.orNull)
      .columnNames(columnNames.map(_.asJava).orNull)
      .catalogId(catalogId.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
