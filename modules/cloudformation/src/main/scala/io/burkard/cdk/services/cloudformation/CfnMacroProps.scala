package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMacroProps {

  def apply(
    name: Option[String] = None,
    functionName: Option[String] = None,
    description: Option[String] = None,
    logGroupName: Option[String] = None,
    logRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnMacroProps =
    (new software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder)
      .name(name.orNull)
      .functionName(functionName.orNull)
      .description(description.orNull)
      .logGroupName(logGroupName.orNull)
      .logRoleArn(logRoleArn.orNull)
      .build()
}
