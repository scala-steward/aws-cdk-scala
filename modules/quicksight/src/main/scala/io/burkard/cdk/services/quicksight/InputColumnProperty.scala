package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputColumnProperty {

  def apply(
    name: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.InputColumnProperty.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .build()
}