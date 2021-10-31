package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GenericLogDriverProps {

  def apply(
    secretOptions: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    logDriver: Option[String] = None,
    options: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.GenericLogDriverProps =
    (new software.amazon.awscdk.services.ecs.GenericLogDriverProps.Builder)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .options(options.map(_.asJava).orNull)
      .build()
}
