package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNetworkInsightsPath {

  def apply(
    internalResourceId: String,
    source: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    destinationPort: Option[Number] = None,
    protocol: Option[String] = None,
    destinationIp: Option[String] = None,
    destination: Option[String] = None,
    sourceIp: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath =
    software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath.Builder
      .create(stackCtx, internalResourceId)
      .source(source.orNull)
      .tags(tags.map(_.asJava).orNull)
      .destinationPort(destinationPort.orNull)
      .protocol(protocol.orNull)
      .destinationIp(destinationIp.orNull)
      .destination(destination.orNull)
      .sourceIp(sourceIp.orNull)
      .build()
}