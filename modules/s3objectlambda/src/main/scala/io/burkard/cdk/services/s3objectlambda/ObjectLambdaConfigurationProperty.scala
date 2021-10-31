package io.burkard.cdk.services.s3objectlambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ObjectLambdaConfigurationProperty {

  def apply(
    cloudWatchMetricsEnabled: Option[Boolean] = None,
    supportingAccessPoint: Option[String] = None,
    allowedFeatures: Option[List[String]] = None,
    transformationConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty =
    (new software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder)
      .cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .supportingAccessPoint(supportingAccessPoint.orNull)
      .allowedFeatures(allowedFeatures.map(_.asJava).orNull)
      .transformationConfigurations(transformationConfigurations.map(_.asJava).orNull)
      .build()
}
