package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolResourceServer {

  def apply(
    internalResourceId: String,
    identifier: Option[String] = None,
    scopes: Option[List[_ <: software.amazon.awscdk.services.cognito.ResourceServerScope]] = None,
    userPoolResourceServerName: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolResourceServer =
    software.amazon.awscdk.services.cognito.UserPoolResourceServer.Builder
      .create(stackCtx, internalResourceId)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolResourceServerName(userPoolResourceServerName.orNull)
      .userPool(userPool.orNull)
      .build()
}