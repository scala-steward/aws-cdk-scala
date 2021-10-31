package io.burkard.cdk.services.robomaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SimulationSoftwareSuiteProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty =
    (new software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
