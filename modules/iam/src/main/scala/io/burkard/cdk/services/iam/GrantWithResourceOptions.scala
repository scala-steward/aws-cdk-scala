package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrantWithResourceOptions {

  def apply(
    resource: software.amazon.awscdk.services.iam.IResourceWithPolicy,
    resourceArns: Option[List[String]] = None,
    resourceSelfArns: Option[List[String]] = None,
    grantee: Option[software.amazon.awscdk.services.iam.IGrantable] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.GrantWithResourceOptions =
    (new software.amazon.awscdk.services.iam.GrantWithResourceOptions.Builder)
      .resource(resource)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .resourceSelfArns(resourceSelfArns.map(_.asJava).orNull)
      .grantee(grantee.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
