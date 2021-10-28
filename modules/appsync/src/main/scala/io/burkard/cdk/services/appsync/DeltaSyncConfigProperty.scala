package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeltaSyncConfigProperty {

  def apply(
    baseTableTtl: Option[String] = None,
    deltaSyncTableTtl: Option[String] = None,
    deltaSyncTableName: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty.Builder)
      .baseTableTtl(baseTableTtl.orNull)
      .deltaSyncTableTtl(deltaSyncTableTtl.orNull)
      .deltaSyncTableName(deltaSyncTableName.orNull)
      .build()
}