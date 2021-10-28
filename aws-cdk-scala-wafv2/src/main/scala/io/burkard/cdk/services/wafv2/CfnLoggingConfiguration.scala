package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLoggingConfiguration {

  def apply(
    internalResourceId: String,
    resourceArn: Option[String] = None,
    redactedFields: Option[List[_]] = None,
    logDestinationConfigs: Option[List[String]] = None,
    loggingFilter: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration =
    software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .resourceArn(resourceArn.orNull)
      .redactedFields(redactedFields.map(_.asJava).orNull)
      .logDestinationConfigs(logDestinationConfigs.map(_.asJava).orNull)
      .loggingFilter(loggingFilter.orNull)
      .build()
}
