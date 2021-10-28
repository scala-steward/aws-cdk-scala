package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdHocFilteringOptionProperty {

  def apply(
    availabilityStatus: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.AdHocFilteringOptionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.AdHocFilteringOptionProperty.Builder)
      .availabilityStatus(availabilityStatus.orNull)
      .build()
}