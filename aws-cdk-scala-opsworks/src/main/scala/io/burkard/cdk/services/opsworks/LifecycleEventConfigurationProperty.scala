package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LifecycleEventConfigurationProperty {

  def apply(
    shutdownEventConfiguration: Option[software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty] = None
  ): software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty =
    (new software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder)
      .shutdownEventConfiguration(shutdownEventConfiguration.orNull)
      .build()
}
