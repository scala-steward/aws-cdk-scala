package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationConfigurationProperty {

  def apply(
    role: String,
    rules: List[_]
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder)
      .role(role)
      .rules(rules.asJava)
      .build()
}
