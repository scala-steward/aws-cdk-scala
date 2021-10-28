package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ThrottleSettings {

  def apply(
    rateLimit: Option[Number] = None,
    burstLimit: Option[Number] = None
  ): software.amazon.awscdk.services.apigateway.ThrottleSettings =
    (new software.amazon.awscdk.services.apigateway.ThrottleSettings.Builder)
      .rateLimit(rateLimit.orNull)
      .burstLimit(burstLimit.orNull)
      .build()
}
