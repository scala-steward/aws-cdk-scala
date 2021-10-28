package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Acl {

  def apply(
    permissions: Option[String] = None,
    ownerGid: Option[String] = None,
    ownerUid: Option[String] = None
  ): software.amazon.awscdk.services.efs.Acl =
    (new software.amazon.awscdk.services.efs.Acl.Builder)
      .permissions(permissions.orNull)
      .ownerGid(ownerGid.orNull)
      .ownerUid(ownerUid.orNull)
      .build()
}