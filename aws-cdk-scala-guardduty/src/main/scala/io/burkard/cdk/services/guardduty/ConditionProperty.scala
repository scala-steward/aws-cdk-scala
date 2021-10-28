package io.burkard.cdk.services.guardduty

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConditionProperty {

  def apply(
    gte: Option[Number] = None,
    lte: Option[Number] = None,
    lt: Option[Number] = None,
    eq: Option[List[String]] = None,
    neq: Option[List[String]] = None
  ): software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty =
    (new software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder)
      .gte(gte.orNull)
      .lte(lte.orNull)
      .lt(lt.orNull)
      .eq(eq.map(_.asJava).orNull)
      .neq(neq.map(_.asJava).orNull)
      .build()
}
