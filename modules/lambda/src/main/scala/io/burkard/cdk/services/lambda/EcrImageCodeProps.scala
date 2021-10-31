package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcrImageCodeProps {

  def apply(
    tag: Option[String] = None,
    cmd: Option[List[String]] = None,
    entrypoint: Option[List[String]] = None,
    workingDirectory: Option[String] = None
  ): software.amazon.awscdk.services.lambda.EcrImageCodeProps =
    (new software.amazon.awscdk.services.lambda.EcrImageCodeProps.Builder)
      .tag(tag.orNull)
      .cmd(cmd.map(_.asJava).orNull)
      .entrypoint(entrypoint.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .build()
}
