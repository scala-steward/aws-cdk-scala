package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeBuildActionProps {

  def apply(
    executeBatchBuild: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType] = None,
    input: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    checkSecretsInPlainTextEnvVariables: Option[Boolean] = None,
    project: Option[software.amazon.awscdk.services.codebuild.IProject] = None,
    extraInputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    combineBatchBuildArtifacts: Option[Boolean] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps.Builder)
      .executeBatchBuild(executeBatchBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .`type`(`type`.orNull)
      .input(input.orNull)
      .checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .project(project.orNull)
      .extraInputs(extraInputs.map(_.asJava).orNull)
      .combineBatchBuildArtifacts(combineBatchBuildArtifacts.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .build()
}