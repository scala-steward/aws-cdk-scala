package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IoTRuleEventProperty {

  def apply(
    awsIotSqlVersion: Option[String] = None,
    sql: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder)
      .awsIotSqlVersion(awsIotSqlVersion.orNull)
      .sql(sql.orNull)
      .build()
}
