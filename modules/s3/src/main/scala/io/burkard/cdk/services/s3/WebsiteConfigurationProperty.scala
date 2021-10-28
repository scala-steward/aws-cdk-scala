package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WebsiteConfigurationProperty {

  def apply(
    indexDocument: Option[String] = None,
    routingRules: Option[List[_]] = None,
    errorDocument: Option[String] = None,
    redirectAllRequestsTo: Option[software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder)
      .indexDocument(indexDocument.orNull)
      .routingRules(routingRules.map(_.asJava).orNull)
      .errorDocument(errorDocument.orNull)
      .redirectAllRequestsTo(redirectAllRequestsTo.orNull)
      .build()
}