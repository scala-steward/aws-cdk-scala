package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfluenceBlogToIndexFieldMappingProperty {

  def apply(
    indexFieldName: Option[String] = None,
    dataSourceFieldName: Option[String] = None,
    dateFieldFormat: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty.Builder)
      .indexFieldName(indexFieldName.orNull)
      .dataSourceFieldName(dataSourceFieldName.orNull)
      .dateFieldFormat(dateFieldFormat.orNull)
      .build()
}
