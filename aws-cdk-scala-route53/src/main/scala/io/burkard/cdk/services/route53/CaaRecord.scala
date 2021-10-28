package io.burkard.cdk.services.route53

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CaaRecord {

  def apply(
    internalResourceId: String,
    recordName: Option[String] = None,
    comment: Option[String] = None,
    values: Option[List[_ <: software.amazon.awscdk.services.route53.CaaRecordValue]] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CaaRecord =
    software.amazon.awscdk.services.route53.CaaRecord.Builder
      .create(stackCtx, internalResourceId)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .values(values.map(_.asJava).orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
