package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AdjustmentTier {

  def apply(
    lowerBound: Option[Number] = None,
    adjustment: Option[Number] = None,
    upperBound: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.AdjustmentTier =
    (new software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder)
      .lowerBound(lowerBound.orNull)
      .adjustment(adjustment.orNull)
      .upperBound(upperBound.orNull)
      .build()
}
