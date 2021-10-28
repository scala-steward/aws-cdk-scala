package io.burkard.cdk.services.synthetics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RunConfigProperty {

  def apply(
    timeoutInSeconds: Option[Number] = None,
    memoryInMb: Option[Number] = None,
    environmentVariables: Option[Map[String, String]] = None,
    activeTracing: Option[Boolean] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.RunConfigProperty.Builder)
      .timeoutInSeconds(timeoutInSeconds.orNull)
      .memoryInMb(memoryInMb.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .activeTracing(activeTracing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
