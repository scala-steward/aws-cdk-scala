package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelQualityJobDefinitionProps {

  def apply(
    modelQualityJobInput: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty,
    jobResources: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty,
    roleArn: String,
    modelQualityAppSpecification: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty,
    modelQualityJobOutputConfig: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    jobDefinitionName: Option[String] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty] = None,
    modelQualityBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps.Builder)
      .modelQualityJobInput(modelQualityJobInput)
      .jobResources(jobResources)
      .roleArn(roleArn)
      .modelQualityAppSpecification(modelQualityAppSpecification)
      .modelQualityJobOutputConfig(modelQualityJobOutputConfig)
      .networkConfig(networkConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .modelQualityBaselineConfig(modelQualityBaselineConfig.orNull)
      .build()
}
