package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectorDefinitionVersionProperty {

  def apply(
    connectors: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder)
      .connectors(connectors.map(_.asJava).orNull)
      .build()
}
