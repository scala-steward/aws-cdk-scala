package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResourceProviderProps {

  def apply(
    description: Option[String] = None,
    codeDirectory: Option[String] = None,
    memorySize: Option[software.amazon.awscdk.Size] = None,
    policyStatements: Option[List[_]] = None,
    environment: Option[Map[String, String]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    runtime: Option[software.amazon.awscdk.CustomResourceProviderRuntime] = None
  ): software.amazon.awscdk.CustomResourceProviderProps =
    (new software.amazon.awscdk.CustomResourceProviderProps.Builder)
      .description(description.orNull)
      .codeDirectory(codeDirectory.orNull)
      .memorySize(memorySize.orNull)
      .policyStatements(policyStatements.map(_.asJava).orNull)
      .environment(environment.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .runtime(runtime.orNull)
      .build()
}
