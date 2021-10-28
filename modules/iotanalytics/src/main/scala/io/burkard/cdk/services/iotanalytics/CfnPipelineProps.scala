package io.burkard.cdk.services.iotanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPipelineProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pipelineName: Option[String] = None,
    pipelineActivities: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipelineProps =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .pipelineName(pipelineName.orNull)
      .pipelineActivities(pipelineActivities.map(_.asJava).orNull)
      .build()
}