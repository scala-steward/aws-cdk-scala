package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlexaSkillDeployAction {

  def apply(
    clientId: Option[String] = None,
    parameterOverridesArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    variablesNamespace: Option[String] = None,
    skillId: Option[String] = None,
    runOrder: Option[Number] = None,
    input: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    refreshToken: Option[software.amazon.awscdk.SecretValue] = None,
    actionName: Option[String] = None,
    clientSecret: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction =
    software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction.Builder
      .create()
      .clientId(clientId.orNull)
      .parameterOverridesArtifact(parameterOverridesArtifact.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .skillId(skillId.orNull)
      .runOrder(runOrder.orNull)
      .input(input.orNull)
      .refreshToken(refreshToken.orNull)
      .actionName(actionName.orNull)
      .clientSecret(clientSecret.orNull)
      .build()
}
