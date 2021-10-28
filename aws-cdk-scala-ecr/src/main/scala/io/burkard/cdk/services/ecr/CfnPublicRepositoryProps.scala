package io.burkard.cdk.services.ecr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPublicRepositoryProps {

  def apply(
    repositoryName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    repositoryCatalogData: Option[AnyRef] = None,
    repositoryPolicyText: Option[AnyRef] = None
  ): software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps =
    (new software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps.Builder)
      .repositoryName(repositoryName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .repositoryCatalogData(repositoryCatalogData.orNull)
      .repositoryPolicyText(repositoryPolicyText.orNull)
      .build()
}
