package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRoleProps {

  def apply(
    maxSessionDuration: Option[Number] = None,
    path: Option[String] = None,
    roleName: Option[String] = None,
    assumeRolePolicyDocument: Option[AnyRef] = None,
    managedPolicyArns: Option[List[String]] = None,
    policies: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissionsBoundary: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnRoleProps =
    (new software.amazon.awscdk.services.iam.CfnRoleProps.Builder)
      .maxSessionDuration(maxSessionDuration.orNull)
      .path(path.orNull)
      .roleName(roleName.orNull)
      .assumeRolePolicyDocument(assumeRolePolicyDocument.orNull)
      .managedPolicyArns(managedPolicyArns.map(_.asJava).orNull)
      .policies(policies.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissionsBoundary(permissionsBoundary.orNull)
      .description(description.orNull)
      .build()
}
