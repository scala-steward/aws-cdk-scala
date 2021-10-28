package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HibernationOptionsProperty {

  def apply(
    configured: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty.Builder)
      .configured(configured.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}