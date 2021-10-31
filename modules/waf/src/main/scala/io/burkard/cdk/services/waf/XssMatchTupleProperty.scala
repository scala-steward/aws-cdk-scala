package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object XssMatchTupleProperty {

  def apply(
    textTransformation: Option[String] = None,
    fieldToMatch: Option[software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty] = None
  ): software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder)
      .textTransformation(textTransformation.orNull)
      .fieldToMatch(fieldToMatch.orNull)
      .build()
}
