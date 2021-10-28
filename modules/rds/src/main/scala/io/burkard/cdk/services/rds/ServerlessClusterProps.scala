package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServerlessClusterProps {

  def apply(
    subnetGroup: Option[software.amazon.awscdk.services.rds.ISubnetGroup] = None,
    backupRetention: Option[software.amazon.awscdk.Duration] = None,
    enableDataApi: Option[Boolean] = None,
    scaling: Option[software.amazon.awscdk.services.rds.ServerlessScalingOptions] = None,
    deletionProtection: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    storageEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    defaultDatabaseName: Option[String] = None,
    clusterIdentifier: Option[String] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    credentials: Option[software.amazon.awscdk.services.rds.Credentials] = None,
    engine: Option[software.amazon.awscdk.services.rds.IClusterEngine] = None
  ): software.amazon.awscdk.services.rds.ServerlessClusterProps =
    (new software.amazon.awscdk.services.rds.ServerlessClusterProps.Builder)
      .subnetGroup(subnetGroup.orNull)
      .backupRetention(backupRetention.orNull)
      .enableDataApi(enableDataApi.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scaling(scaling.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .storageEncryptionKey(storageEncryptionKey.orNull)
      .defaultDatabaseName(defaultDatabaseName.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .parameterGroup(parameterGroup.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .removalPolicy(removalPolicy.orNull)
      .credentials(credentials.orNull)
      .engine(engine.orNull)
      .build()
}