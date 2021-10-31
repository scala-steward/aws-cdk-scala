package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProxyConfigurationProperty {

  def apply(
    containerName: Option[String] = None,
    proxyConfigurationProperties: Option[List[_]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.Builder)
      .containerName(containerName.orNull)
      .proxyConfigurationProperties(proxyConfigurationProperties.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
