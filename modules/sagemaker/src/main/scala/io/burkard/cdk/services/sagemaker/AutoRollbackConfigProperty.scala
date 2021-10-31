package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoRollbackConfigProperty {

  def apply(
    alarms: Option[List[_]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.AutoRollbackConfigProperty.Builder)
      .alarms(alarms.map(_.asJava).orNull)
      .build()
}
