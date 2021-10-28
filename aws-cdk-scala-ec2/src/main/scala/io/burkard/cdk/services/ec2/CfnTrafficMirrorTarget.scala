package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrafficMirrorTarget {

  def apply(
    internalResourceId: String,
    networkLoadBalancerArn: Option[String] = None,
    networkInterfaceId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget =
    software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget.Builder
      .create(stackCtx, internalResourceId)
      .networkLoadBalancerArn(networkLoadBalancerArn.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
