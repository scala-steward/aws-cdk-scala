package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RouteBaseProps {

  def apply(
    routeSpec: Option[software.amazon.awscdk.services.appmesh.RouteSpec] = None,
    routeName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.RouteBaseProps =
    (new software.amazon.awscdk.services.appmesh.RouteBaseProps.Builder)
      .routeSpec(routeSpec.orNull)
      .routeName(routeName.orNull)
      .build()
}