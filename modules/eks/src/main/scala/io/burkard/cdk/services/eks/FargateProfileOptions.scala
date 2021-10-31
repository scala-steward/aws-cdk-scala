package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FargateProfileOptions {

  def apply(
    fargateProfileName: Option[String] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    selectors: Option[List[_ <: software.amazon.awscdk.services.eks.Selector]] = None,
    podExecutionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.eks.FargateProfileOptions =
    (new software.amazon.awscdk.services.eks.FargateProfileOptions.Builder)
      .fargateProfileName(fargateProfileName.orNull)
      .subnetSelection(subnetSelection.orNull)
      .selectors(selectors.map(_.asJava).orNull)
      .podExecutionRole(podExecutionRole.orNull)
      .vpc(vpc.orNull)
      .build()
}
