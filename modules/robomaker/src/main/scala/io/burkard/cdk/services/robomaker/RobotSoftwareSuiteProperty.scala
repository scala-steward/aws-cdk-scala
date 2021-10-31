package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RobotSoftwareSuiteProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
