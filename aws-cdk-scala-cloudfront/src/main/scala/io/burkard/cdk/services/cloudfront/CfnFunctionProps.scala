package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFunctionProps {

  def apply(
    name: Option[String] = None,
    functionMetadata: Option[software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty] = None,
    functionCode: Option[String] = None,
    autoPublish: Option[Boolean] = None,
    functionConfig: Option[software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnFunctionProps =
    (new software.amazon.awscdk.services.cloudfront.CfnFunctionProps.Builder)
      .name(name.orNull)
      .functionMetadata(functionMetadata.orNull)
      .functionCode(functionCode.orNull)
      .autoPublish(autoPublish.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .functionConfig(functionConfig.orNull)
      .build()
}
