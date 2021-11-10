package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Table {

  def apply(
    internalResourceId: String,
    timeToLiveAttribute: Option[String] = None,
    waitForReplicationToFinish: Option[Boolean] = None,
    partitionKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None,
    kinesisStream: Option[software.amazon.awscdk.services.kinesis.IStream] = None,
    pointInTimeRecovery: Option[Boolean] = None,
    encryption: Option[software.amazon.awscdk.services.dynamodb.TableEncryption] = None,
    readCapacity: Option[Number] = None,
    tableName: Option[String] = None,
    stream: Option[software.amazon.awscdk.services.dynamodb.StreamViewType] = None,
    replicationTimeout: Option[software.amazon.awscdk.Duration] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    serverSideEncryption: Option[Boolean] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    replicationRegions: Option[List[String]] = None,
    sortKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None,
    writeCapacity: Option[Number] = None,
    billingMode: Option[software.amazon.awscdk.services.dynamodb.BillingMode] = None,
    contributorInsightsEnabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dynamodb.Table =
    software.amazon.awscdk.services.dynamodb.Table.Builder
      .create(stackCtx, internalResourceId)
      .timeToLiveAttribute(timeToLiveAttribute.orNull)
      .waitForReplicationToFinish(waitForReplicationToFinish.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .partitionKey(partitionKey.orNull)
      .kinesisStream(kinesisStream.orNull)
      .pointInTimeRecovery(pointInTimeRecovery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryption(encryption.orNull)
      .readCapacity(readCapacity.orNull)
      .tableName(tableName.orNull)
      .stream(stream.orNull)
      .replicationTimeout(replicationTimeout.orNull)
      .encryptionKey(encryptionKey.orNull)
      .serverSideEncryption(serverSideEncryption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removalPolicy(removalPolicy.orNull)
      .replicationRegions(replicationRegions.map(_.asJava).orNull)
      .sortKey(sortKey.orNull)
      .writeCapacity(writeCapacity.orNull)
      .billingMode(billingMode.orNull)
      .contributorInsightsEnabled(contributorInsightsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
