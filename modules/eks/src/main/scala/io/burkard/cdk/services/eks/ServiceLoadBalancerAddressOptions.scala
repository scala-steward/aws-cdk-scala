package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceLoadBalancerAddressOptions {

  def apply(
    timeout: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions =
    (new software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions.Builder)
      .timeout(timeout.orNull)
      .namespace(namespace.orNull)
      .build()
}