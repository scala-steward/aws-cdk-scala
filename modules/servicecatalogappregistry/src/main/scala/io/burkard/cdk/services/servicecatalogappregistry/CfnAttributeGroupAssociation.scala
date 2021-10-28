package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAttributeGroupAssociation {

  def apply(
    internalResourceId: String,
    application: Option[String] = None,
    attributeGroup: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation =
    software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation.Builder
      .create(stackCtx, internalResourceId)
      .application(application.orNull)
      .attributeGroup(attributeGroup.orNull)
      .build()
}