package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResolveChangeContextOptions {

  def apply(
    allowIntrinsicKeys: Option[Boolean] = None
  ): software.amazon.awscdk.ResolveChangeContextOptions =
    (new software.amazon.awscdk.ResolveChangeContextOptions.Builder)
      .allowIntrinsicKeys(allowIntrinsicKeys.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
