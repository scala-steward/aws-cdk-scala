package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketEncryptionProperty {

  def apply(
    serverSideEncryptionConfiguration: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder)
      .serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.map(_.asJava).orNull)
      .build()
}
