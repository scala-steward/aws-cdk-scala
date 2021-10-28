package io.burkard.cdk.services.codeartifact

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomainProps {

  def apply(
    permissionsPolicyDocument: Option[AnyRef] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    encryptionKey: Option[String] = None
  ): software.amazon.awscdk.services.codeartifact.CfnDomainProps =
    (new software.amazon.awscdk.services.codeartifact.CfnDomainProps.Builder)
      .permissionsPolicyDocument(permissionsPolicyDocument.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
