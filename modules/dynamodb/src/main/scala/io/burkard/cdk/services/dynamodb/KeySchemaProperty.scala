package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeySchemaProperty {

  def apply(
    keyType: Option[String] = None,
    attributeName: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.KeySchemaProperty.Builder)
      .keyType(keyType.orNull)
      .attributeName(attributeName.orNull)
      .build()
}
