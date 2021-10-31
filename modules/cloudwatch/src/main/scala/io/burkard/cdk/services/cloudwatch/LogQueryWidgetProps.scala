package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogQueryWidgetProps {

  def apply(
    logGroupNames: Option[List[String]] = None,
    height: Option[Number] = None,
    queryString: Option[String] = None,
    queryLines: Option[List[String]] = None,
    region: Option[String] = None,
    title: Option[String] = None,
    width: Option[Number] = None,
    view: Option[software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType] = None
  ): software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps =
    (new software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps.Builder)
      .logGroupNames(logGroupNames.map(_.asJava).orNull)
      .height(height.orNull)
      .queryString(queryString.orNull)
      .queryLines(queryLines.map(_.asJava).orNull)
      .region(region.orNull)
      .title(title.orNull)
      .width(width.orNull)
      .view(view.orNull)
      .build()
}
