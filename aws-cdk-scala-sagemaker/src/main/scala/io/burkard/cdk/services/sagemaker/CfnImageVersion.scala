package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnImageVersion {

  def apply(
    internalResourceId: String,
    baseImage: Option[String] = None,
    imageName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnImageVersion =
    software.amazon.awscdk.services.sagemaker.CfnImageVersion.Builder
      .create(stackCtx, internalResourceId)
      .baseImage(baseImage.orNull)
      .imageName(imageName.orNull)
      .build()
}
