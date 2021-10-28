package io.burkard.cdk.services.apigatewayv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVpcLinkProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .name(name.orNull)
      .tags(tags.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}