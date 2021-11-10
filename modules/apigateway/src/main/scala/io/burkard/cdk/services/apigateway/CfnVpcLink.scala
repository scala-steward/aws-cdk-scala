package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVpcLink {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    targetArns: Option[List[String]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnVpcLink =
    software.amazon.awscdk.services.apigateway.CfnVpcLink.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .targetArns(targetArns.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
