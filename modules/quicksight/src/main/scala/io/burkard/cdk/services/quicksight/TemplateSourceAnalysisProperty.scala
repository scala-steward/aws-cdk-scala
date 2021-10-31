package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TemplateSourceAnalysisProperty {

  def apply(
    arn: Option[String] = None,
    dataSetReferences: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceAnalysisProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceAnalysisProperty.Builder)
      .arn(arn.orNull)
      .dataSetReferences(dataSetReferences.map(_.asJava).orNull)
      .build()
}
