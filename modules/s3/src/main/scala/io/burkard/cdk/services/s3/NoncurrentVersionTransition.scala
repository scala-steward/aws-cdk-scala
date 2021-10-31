package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NoncurrentVersionTransition {

  def apply(
    transitionAfter: Option[software.amazon.awscdk.Duration] = None,
    storageClass: Option[software.amazon.awscdk.services.s3.StorageClass] = None
  ): software.amazon.awscdk.services.s3.NoncurrentVersionTransition =
    (new software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder)
      .transitionAfter(transitionAfter.orNull)
      .storageClass(storageClass.orNull)
      .build()
}
