package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipelineProps {

  def apply(
    restartExecutionOnUpdate: Option[Boolean] = None,
    stages: Option[List[_]] = None,
    name: Option[String] = None,
    disableInboundStageTransitions: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    artifactStore: Option[software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty] = None,
    roleArn: Option[String] = None,
    artifactStores: Option[List[_]] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipelineProps =
    (new software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder)
      .restartExecutionOnUpdate(restartExecutionOnUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stages(stages.map(_.asJava).orNull)
      .name(name.orNull)
      .disableInboundStageTransitions(disableInboundStageTransitions.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .artifactStore(artifactStore.orNull)
      .roleArn(roleArn.orNull)
      .artifactStores(artifactStores.map(_.asJava).orNull)
      .build()
}
