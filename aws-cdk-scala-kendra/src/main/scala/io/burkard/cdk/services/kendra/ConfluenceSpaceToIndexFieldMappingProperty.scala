package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfluenceSpaceToIndexFieldMappingProperty {

  def apply(
    indexFieldName: Option[String] = None,
    dataSourceFieldName: Option[String] = None,
    dateFieldFormat: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.Builder)
      .indexFieldName(indexFieldName.orNull)
      .dataSourceFieldName(dataSourceFieldName.orNull)
      .dateFieldFormat(dateFieldFormat.orNull)
      .build()
}
