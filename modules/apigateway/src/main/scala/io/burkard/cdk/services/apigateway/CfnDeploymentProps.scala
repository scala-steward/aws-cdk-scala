package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeploymentProps {

  def apply(
    deploymentCanarySettings: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty] = None,
    description: Option[String] = None,
    stageDescription: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty] = None,
    stageName: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDeploymentProps =
    (new software.amazon.awscdk.services.apigateway.CfnDeploymentProps.Builder)
      .deploymentCanarySettings(deploymentCanarySettings.orNull)
      .description(description.orNull)
      .stageDescription(stageDescription.orNull)
      .stageName(stageName.orNull)
      .restApiId(restApiId.orNull)
      .build()
}