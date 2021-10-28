package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerImageConfig {

  def apply(
    repositoryCredentials: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty] = None,
    imageName: Option[String] = None
  ): software.amazon.awscdk.services.ecs.ContainerImageConfig =
    (new software.amazon.awscdk.services.ecs.ContainerImageConfig.Builder)
      .repositoryCredentials(repositoryCredentials.orNull)
      .imageName(imageName.orNull)
      .build()
}