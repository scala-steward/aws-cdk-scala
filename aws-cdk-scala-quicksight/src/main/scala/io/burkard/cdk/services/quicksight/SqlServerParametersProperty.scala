package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlServerParametersProperty {

  def apply(
    database: Option[String] = None,
    host: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty.Builder)
      .database(database.orNull)
      .host(host.orNull)
      .port(port.orNull)
      .build()
}
