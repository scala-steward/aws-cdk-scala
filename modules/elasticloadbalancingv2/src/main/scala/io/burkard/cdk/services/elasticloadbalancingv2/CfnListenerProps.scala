package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnListenerProps {

  def apply(
    defaultActions: Option[List[_]] = None,
    sslPolicy: Option[String] = None,
    port: Option[Number] = None,
    certificates: Option[List[_]] = None,
    protocol: Option[String] = None,
    loadBalancerArn: Option[String] = None,
    alpnPolicy: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps.Builder)
      .defaultActions(defaultActions.map(_.asJava).orNull)
      .sslPolicy(sslPolicy.orNull)
      .port(port.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .loadBalancerArn(loadBalancerArn.orNull)
      .alpnPolicy(alpnPolicy.map(_.asJava).orNull)
      .build()
}
