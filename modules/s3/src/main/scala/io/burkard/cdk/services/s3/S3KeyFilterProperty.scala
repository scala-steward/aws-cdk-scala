package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3KeyFilterProperty {

  def apply(
    rules: List[_]
  ): software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder)
      .rules(rules.asJava)
      .build()
}
