package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    projectName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    portalId: Option[String] = None,
    projectDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnProject =
    software.amazon.awscdk.services.iotsitewise.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .portalId(portalId.orNull)
      .projectDescription(projectDescription.orNull)
      .build()
}