package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StoppingConditionProperty {

  def apply(
    maxRuntimeInSeconds: Number
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty.Builder)
      .maxRuntimeInSeconds(maxRuntimeInSeconds)
      .build()
}
