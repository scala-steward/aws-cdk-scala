package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecordFormatProperty {

  def apply(
    recordFormatType: Option[String] = None,
    mappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder)
      .recordFormatType(recordFormatType.orNull)
      .mappingParameters(mappingParameters.orNull)
      .build()
}
