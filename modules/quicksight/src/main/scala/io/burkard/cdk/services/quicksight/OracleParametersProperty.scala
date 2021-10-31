package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleParametersProperty {

  def apply(
    database: Option[String] = None,
    host: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty.Builder)
      .database(database.orNull)
      .host(host.orNull)
      .port(port.orNull)
      .build()
}
