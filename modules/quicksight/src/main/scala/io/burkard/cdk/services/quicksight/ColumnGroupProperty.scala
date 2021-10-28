package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnGroupProperty {

  def apply(
    geoSpatialColumnGroup: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.GeoSpatialColumnGroupProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.ColumnGroupProperty.Builder)
      .geoSpatialColumnGroup(geoSpatialColumnGroup.orNull)
      .build()
}