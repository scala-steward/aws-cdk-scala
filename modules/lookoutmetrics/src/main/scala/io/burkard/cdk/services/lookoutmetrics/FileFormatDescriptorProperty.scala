package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileFormatDescriptorProperty {

  def apply(
    jsonFormatDescriptor: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty] = None,
    csvFormatDescriptor: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty.Builder)
      .jsonFormatDescriptor(jsonFormatDescriptor.orNull)
      .csvFormatDescriptor(csvFormatDescriptor.orNull)
      .build()
}