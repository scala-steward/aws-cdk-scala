package io.burkard.cdk.services.acmpca

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPermissionProps {

  def apply(
    sourceAccount: Option[String] = None,
    certificateAuthorityArn: Option[String] = None,
    principal: Option[String] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.acmpca.CfnPermissionProps =
    (new software.amazon.awscdk.services.acmpca.CfnPermissionProps.Builder)
      .sourceAccount(sourceAccount.orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .principal(principal.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
