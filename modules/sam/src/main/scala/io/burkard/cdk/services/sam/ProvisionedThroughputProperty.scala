package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisionedThroughputProperty {

  def apply(
    writeCapacityUnits: Option[Number] = None,
    readCapacityUnits: Option[Number] = None
  ): software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty =
    (new software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder)
      .writeCapacityUnits(writeCapacityUnits.orNull)
      .readCapacityUnits(readCapacityUnits.orNull)
      .build()
}
