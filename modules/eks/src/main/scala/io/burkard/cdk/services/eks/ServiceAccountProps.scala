package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceAccountProps {

  def apply(
    name: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.ServiceAccountProps =
    (new software.amazon.awscdk.services.eks.ServiceAccountProps.Builder)
      .name(name.orNull)
      .cluster(cluster.orNull)
      .namespace(namespace.orNull)
      .build()
}
