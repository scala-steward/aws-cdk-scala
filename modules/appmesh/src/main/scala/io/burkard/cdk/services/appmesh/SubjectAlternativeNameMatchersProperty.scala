package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubjectAlternativeNameMatchersProperty {

  def apply(
    exact: Option[List[String]] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder)
      .exact(exact.map(_.asJava).orNull)
      .build()
}