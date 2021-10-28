package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentCircuitBreaker {

  def apply(
    rollback: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker =
    (new software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker.Builder)
      .rollback(rollback.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}