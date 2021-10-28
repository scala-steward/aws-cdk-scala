package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBucketPolicyProps {

  def apply(
    policyDocument: Option[AnyRef] = None,
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucketPolicyProps =
    (new software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder)
      .policyDocument(policyDocument.orNull)
      .bucket(bucket.orNull)
      .build()
}