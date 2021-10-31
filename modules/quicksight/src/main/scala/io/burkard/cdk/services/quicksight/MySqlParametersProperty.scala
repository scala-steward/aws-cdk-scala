package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MySqlParametersProperty {

  def apply(
    database: Option[String] = None,
    host: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty.Builder)
      .database(database.orNull)
      .host(host.orNull)
      .port(port.orNull)
      .build()
}
