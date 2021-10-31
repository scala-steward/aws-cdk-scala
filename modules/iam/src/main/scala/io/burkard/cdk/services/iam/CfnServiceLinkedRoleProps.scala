package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceLinkedRoleProps {

  def apply(
    description: Option[String] = None,
    customSuffix: Option[String] = None,
    awsServiceName: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps =
    (new software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps.Builder)
      .description(description.orNull)
      .customSuffix(customSuffix.orNull)
      .awsServiceName(awsServiceName.orNull)
      .build()
}
