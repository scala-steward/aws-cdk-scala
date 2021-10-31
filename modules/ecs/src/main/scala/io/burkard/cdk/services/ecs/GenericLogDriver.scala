package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GenericLogDriver {

  def apply(
    secretOptions: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    logDriver: Option[String] = None,
    options: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.GenericLogDriver =
    software.amazon.awscdk.services.ecs.GenericLogDriver.Builder
      .create()
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .options(options.map(_.asJava).orNull)
      .build()
}
