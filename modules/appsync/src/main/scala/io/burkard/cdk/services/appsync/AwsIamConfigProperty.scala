package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsIamConfigProperty {

  def apply(
    signingRegion: Option[String] = None,
    signingServiceName: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder)
      .signingRegion(signingRegion.orNull)
      .signingServiceName(signingServiceName.orNull)
      .build()
}