package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserGroupProps {

  def apply(
    userGroupId: Option[String] = None,
    userIds: Option[List[String]] = None,
    engine: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnUserGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnUserGroupProps.Builder)
      .userGroupId(userGroupId.orNull)
      .userIds(userIds.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}
