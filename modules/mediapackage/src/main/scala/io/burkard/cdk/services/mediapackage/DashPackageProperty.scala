package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DashPackageProperty {

  def apply(
    segmentTemplateFormat: Option[String] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty] = None,
    includeEncoderConfigurationInSegments: Option[Boolean] = None,
    segmentDurationSeconds: Option[Number] = None,
    periodTriggers: Option[List[String]] = None,
    dashManifests: Option[List[_]] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty.Builder)
      .segmentTemplateFormat(segmentTemplateFormat.orNull)
      .encryption(encryption.orNull)
      .includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .periodTriggers(periodTriggers.map(_.asJava).orNull)
      .dashManifests(dashManifests.map(_.asJava).orNull)
      .build()
}