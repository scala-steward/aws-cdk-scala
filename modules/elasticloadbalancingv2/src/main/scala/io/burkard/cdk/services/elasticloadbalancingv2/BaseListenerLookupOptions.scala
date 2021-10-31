package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseListenerLookupOptions {

  def apply(
    loadBalancerArn: Option[String] = None,
    listenerPort: Option[Number] = None,
    loadBalancerTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .listenerPort(listenerPort.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
