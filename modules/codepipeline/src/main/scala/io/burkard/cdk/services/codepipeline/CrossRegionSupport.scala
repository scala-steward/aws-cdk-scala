package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossRegionSupport {

  def apply(
    replicationBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    stack: Option[software.amazon.awscdk.Stack] = None
  ): software.amazon.awscdk.services.codepipeline.CrossRegionSupport =
    (new software.amazon.awscdk.services.codepipeline.CrossRegionSupport.Builder)
      .replicationBucket(replicationBucket.orNull)
      .stack(stack.orNull)
      .build()
}
