package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseTableOutputOptionsProperty {

  def apply(
    tempDirectory: Option[software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty] = None,
    tableName: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty.Builder)
      .tempDirectory(tempDirectory.orNull)
      .tableName(tableName.orNull)
      .build()
}