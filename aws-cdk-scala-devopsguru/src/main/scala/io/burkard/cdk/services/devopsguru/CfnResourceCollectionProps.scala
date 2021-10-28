package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceCollectionProps {

  def apply(
    resourceCollectionFilter: Option[software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty] = None
  ): software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps =
    (new software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps.Builder)
      .resourceCollectionFilter(resourceCollectionFilter.orNull)
      .build()
}
