package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Cluster {

  def apply(
    internalResourceId: String,
    outputMastersRoleArn: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    mastersRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    endpointAccess: Option[software.amazon.awscdk.services.eks.EndpointAccess] = None,
    placeClusterHandlerInVpc: Option[Boolean] = None,
    version: Option[software.amazon.awscdk.services.eks.KubernetesVersion] = None,
    prune: Option[Boolean] = None,
    kubectlEnvironment: Option[Map[String, String]] = None,
    outputConfigCommand: Option[Boolean] = None,
    clusterName: Option[String] = None,
    kubectlLayer: Option[software.amazon.awscdk.services.lambda.ILayerVersion] = None,
    defaultCapacity: Option[Number] = None,
    clusterHandlerEnvironment: Option[Map[String, String]] = None,
    kubectlMemory: Option[software.amazon.awscdk.Size] = None,
    vpcSubnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    outputClusterName: Option[Boolean] = None,
    defaultCapacityInstance: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    onEventLayer: Option[software.amazon.awscdk.services.lambda.ILayerVersion] = None,
    coreDnsComputeType: Option[software.amazon.awscdk.services.eks.CoreDnsComputeType] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    secretsEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    defaultCapacityType: Option[software.amazon.awscdk.services.eks.DefaultCapacityType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.Cluster =
    software.amazon.awscdk.services.eks.Cluster.Builder
      .create(stackCtx, internalResourceId)
      .outputMastersRoleArn(outputMastersRoleArn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .mastersRole(mastersRole.orNull)
      .endpointAccess(endpointAccess.orNull)
      .placeClusterHandlerInVpc(placeClusterHandlerInVpc.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kubectlEnvironment(kubectlEnvironment.map(_.asJava).orNull)
      .outputConfigCommand(outputConfigCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clusterName(clusterName.orNull)
      .kubectlLayer(kubectlLayer.orNull)
      .defaultCapacity(defaultCapacity.orNull)
      .clusterHandlerEnvironment(clusterHandlerEnvironment.map(_.asJava).orNull)
      .kubectlMemory(kubectlMemory.orNull)
      .vpcSubnets(vpcSubnets.map(_.asJava).orNull)
      .outputClusterName(outputClusterName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultCapacityInstance(defaultCapacityInstance.orNull)
      .vpc(vpc.orNull)
      .onEventLayer(onEventLayer.orNull)
      .coreDnsComputeType(coreDnsComputeType.orNull)
      .securityGroup(securityGroup.orNull)
      .secretsEncryptionKey(secretsEncryptionKey.orNull)
      .defaultCapacityType(defaultCapacityType.orNull)
      .build()
}