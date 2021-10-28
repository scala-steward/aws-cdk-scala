package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonClassifierProperty {

  def apply(
    name: Option[String] = None,
    jsonPath: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty =
    (new software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty.Builder)
      .name(name.orNull)
      .jsonPath(jsonPath.orNull)
      .build()
}