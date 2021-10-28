package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkListenerProps {

  def apply(
    alpnPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy] = None,
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    defaultTargetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup]] = None,
    defaultAction: Option[software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction] = None,
    port: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.Protocol] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None,
    loadBalancer: Option[software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps.Builder)
      .alpnPolicy(alpnPolicy.orNull)
      .sslPolicy(sslPolicy.orNull)
      .defaultTargetGroups(defaultTargetGroups.map(_.asJava).orNull)
      .defaultAction(defaultAction.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .loadBalancer(loadBalancer.orNull)
      .build()
}
