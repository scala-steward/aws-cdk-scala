package io.burkard.cdk.services.elasticache

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityGroup {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnSecurityGroup =
    software.amazon.awscdk.services.elasticache.CfnSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
