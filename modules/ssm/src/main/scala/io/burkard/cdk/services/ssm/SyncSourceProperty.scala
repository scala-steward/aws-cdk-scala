package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SyncSourceProperty {

  def apply(
    sourceType: Option[String] = None,
    includeFutureRegions: Option[Boolean] = None,
    sourceRegions: Option[List[String]] = None,
    awsOrganizationsSource: Option[software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty] = None
  ): software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty =
    (new software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty.Builder)
      .sourceType(sourceType.orNull)
      .includeFutureRegions(includeFutureRegions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceRegions(sourceRegions.map(_.asJava).orNull)
      .awsOrganizationsSource(awsOrganizationsSource.orNull)
      .build()
}
