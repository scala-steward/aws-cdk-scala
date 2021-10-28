package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DlqDestinationConfig {

  def apply(
    destination: Option[String] = None
  ): software.amazon.awscdk.services.lambda.DlqDestinationConfig =
    (new software.amazon.awscdk.services.lambda.DlqDestinationConfig.Builder)
      .destination(destination.orNull)
      .build()
}