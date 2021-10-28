package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SelfManagedKafkaEventSourceProps {

  def apply(
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    authenticationMethod: Option[software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod] = None,
    parallelizationFactor: Option[Number] = None,
    enabled: Option[Boolean] = None,
    tumblingWindow: Option[software.amazon.awscdk.Duration] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    maxBatchingWindow: Option[software.amazon.awscdk.Duration] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    retryAttempts: Option[Number] = None,
    onFailure: Option[software.amazon.awscdk.services.lambda.IEventSourceDlq] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    bootstrapServers: Option[List[String]] = None,
    batchSize: Option[Number] = None,
    maxRecordAge: Option[software.amazon.awscdk.Duration] = None,
    bisectBatchOnError: Option[Boolean] = None,
    reportBatchItemFailures: Option[Boolean] = None,
    startingPosition: Option[software.amazon.awscdk.services.lambda.StartingPosition] = None,
    topic: Option[String] = None
  ): software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps =
    (new software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps.Builder)
      .secret(secret.orNull)
      .authenticationMethod(authenticationMethod.orNull)
      .parallelizationFactor(parallelizationFactor.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tumblingWindow(tumblingWindow.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .maxBatchingWindow(maxBatchingWindow.orNull)
      .vpc(vpc.orNull)
      .retryAttempts(retryAttempts.orNull)
      .onFailure(onFailure.orNull)
      .securityGroup(securityGroup.orNull)
      .bootstrapServers(bootstrapServers.map(_.asJava).orNull)
      .batchSize(batchSize.orNull)
      .maxRecordAge(maxRecordAge.orNull)
      .bisectBatchOnError(bisectBatchOnError.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .reportBatchItemFailures(reportBatchItemFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .startingPosition(startingPosition.orNull)
      .topic(topic.orNull)
      .build()
}
