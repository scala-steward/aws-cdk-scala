package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkConfigurationProperty {

  def apply(
    assignPublicIp: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty.Builder)
      .assignPublicIp(assignPublicIp.orNull)
      .build()
}
