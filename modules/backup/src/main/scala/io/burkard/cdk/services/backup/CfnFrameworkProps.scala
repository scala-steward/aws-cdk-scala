package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFrameworkProps {

  def apply(
    frameworkDescription: Option[String] = None,
    frameworkControls: Option[List[_]] = None,
    frameworkName: Option[String] = None,
    frameworkTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnFrameworkProps =
    (new software.amazon.awscdk.services.backup.CfnFrameworkProps.Builder)
      .frameworkDescription(frameworkDescription.orNull)
      .frameworkControls(frameworkControls.map(_.asJava).orNull)
      .frameworkName(frameworkName.orNull)
      .frameworkTags(frameworkTags.map(_.asJava).orNull)
      .build()
}
