package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCProps {

  def apply(
    cidrBlock: String,
    enableDnsSupport: Option[Boolean] = None,
    instanceTenancy: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enableDnsHostnames: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCProps.Builder)
      .cidrBlock(cidrBlock)
      .enableDnsSupport(enableDnsSupport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceTenancy(instanceTenancy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enableDnsHostnames(enableDnsHostnames.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
