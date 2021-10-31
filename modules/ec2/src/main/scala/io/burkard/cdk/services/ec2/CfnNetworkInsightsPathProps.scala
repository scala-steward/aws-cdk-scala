package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInsightsPathProps {

  def apply(
    source: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    destinationPort: Option[Number] = None,
    protocol: Option[String] = None,
    destinationIp: Option[String] = None,
    destination: Option[String] = None,
    sourceIp: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps.Builder)
      .source(source.orNull)
      .tags(tags.map(_.asJava).orNull)
      .destinationPort(destinationPort.orNull)
      .protocol(protocol.orNull)
      .destinationIp(destinationIp.orNull)
      .destination(destination.orNull)
      .sourceIp(sourceIp.orNull)
      .build()
}
