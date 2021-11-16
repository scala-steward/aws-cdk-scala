package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GetContextKeyOptions {

  def apply(
    provider: String,
    props: Option[Map[String, _]] = None
  ): software.amazon.awscdk.GetContextKeyOptions =
    (new software.amazon.awscdk.GetContextKeyOptions.Builder)
      .provider(provider)
      .props(props.map(_.asJava).orNull)
      .build()
}
