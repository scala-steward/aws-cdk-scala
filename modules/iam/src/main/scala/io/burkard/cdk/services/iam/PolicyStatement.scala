package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PolicyStatement {

  def apply(
    conditions: Option[Map[String, _]] = None,
    principals: Option[List[_ <: software.amazon.awscdk.services.iam.IPrincipal]] = None,
    effect: Option[software.amazon.awscdk.services.iam.Effect] = None,
    notActions: Option[List[String]] = None,
    notResources: Option[List[String]] = None,
    notPrincipals: Option[List[_ <: software.amazon.awscdk.services.iam.IPrincipal]] = None,
    sid: Option[String] = None,
    resources: Option[List[String]] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.PolicyStatement =
    software.amazon.awscdk.services.iam.PolicyStatement.Builder
      .create()
      .conditions(conditions.map(_.asJava).orNull)
      .principals(principals.map(_.asJava).orNull)
      .effect(effect.orNull)
      .notActions(notActions.map(_.asJava).orNull)
      .notResources(notResources.map(_.asJava).orNull)
      .notPrincipals(notPrincipals.map(_.asJava).orNull)
      .sid(sid.orNull)
      .resources(resources.map(_.asJava).orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}