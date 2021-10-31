package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GroupOwnerSettingProperty {

  def apply(
    groupOwner: Option[String] = None,
    autoAddGroupOwner: Option[Boolean] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty.Builder)
      .groupOwner(groupOwner.orNull)
      .autoAddGroupOwner(autoAddGroupOwner.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
