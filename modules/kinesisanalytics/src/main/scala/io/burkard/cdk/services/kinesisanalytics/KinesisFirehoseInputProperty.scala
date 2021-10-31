package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisFirehoseInputProperty {

  def apply(
    resourceArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder)
      .resourceArn(resourceArn.orNull)
      .build()
}
