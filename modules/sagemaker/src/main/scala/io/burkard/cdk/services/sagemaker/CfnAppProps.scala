package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAppProps {

  def apply(
    appType: Option[String] = None,
    userProfileName: Option[String] = None,
    resourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty] = None,
    domainId: Option[String] = None,
    appName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppProps =
    (new software.amazon.awscdk.services.sagemaker.CfnAppProps.Builder)
      .appType(appType.orNull)
      .userProfileName(userProfileName.orNull)
      .resourceSpec(resourceSpec.orNull)
      .domainId(domainId.orNull)
      .appName(appName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
