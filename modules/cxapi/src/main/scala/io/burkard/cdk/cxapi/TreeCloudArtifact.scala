package io.burkard.cdk.cxapi

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TreeCloudArtifact {

  def apply(
    assembly: software.amazon.awscdk.cxapi.CloudAssembly,
    name: String,
    displayName: Option[String] = None,
    properties0: Option[software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties] = None,
    properties1: Option[software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties] = None,
    properties2: Option[software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties] = None,
    properties3: Option[software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties] = None,
    environment: Option[String] = None,
    metadata: Option[Map[String, _ <: List[_ <: software.amazon.awscdk.cloudassembly.schema.MetadataEntry]]] = None,
    `type`: Option[software.amazon.awscdk.cloudassembly.schema.ArtifactType] = None,
    dependencies: Option[List[String]] = None
  ): software.amazon.awscdk.cxapi.TreeCloudArtifact =
    software.amazon.awscdk.cxapi.TreeCloudArtifact.Builder
      .create(assembly, name)
      .displayName(displayName.orNull)
      .properties(properties0.orNull)
      .properties(properties1.orNull)
      .properties(properties2.orNull)
      .properties(properties3.orNull)
      .environment(environment.orNull)
      .metadata(metadata.map(_.view.mapValues(_.asJava).toMap.asJava).orNull)
      .`type`(`type`.orNull)
      .dependencies(dependencies.map(_.asJava).orNull)
      .build()
}