package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CopyCommandProperty {

  def apply(
    dataTableColumns: Option[String] = None,
    dataTableName: Option[String] = None,
    copyOptions: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder)
      .dataTableColumns(dataTableColumns.orNull)
      .dataTableName(dataTableName.orNull)
      .copyOptions(copyOptions.orNull)
      .build()
}
