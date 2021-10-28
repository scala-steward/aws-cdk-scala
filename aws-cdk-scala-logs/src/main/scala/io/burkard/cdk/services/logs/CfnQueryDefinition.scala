package io.burkard.cdk.services.logs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnQueryDefinition {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    logGroupNames: Option[List[String]] = None,
    queryString: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnQueryDefinition =
    software.amazon.awscdk.services.logs.CfnQueryDefinition.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .logGroupNames(logGroupNames.map(_.asJava).orNull)
      .queryString(queryString.orNull)
      .build()
}
