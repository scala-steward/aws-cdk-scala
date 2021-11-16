package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolResourceServerProps {

  def apply(
    userPool: software.amazon.awscdk.services.cognito.IUserPool,
    identifier: Option[String] = None,
    scopes: Option[List[_ <: software.amazon.awscdk.services.cognito.ResourceServerScope]] = None,
    userPoolResourceServerName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.UserPoolResourceServerProps =
    (new software.amazon.awscdk.services.cognito.UserPoolResourceServerProps.Builder)
      .userPool(userPool)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolResourceServerName(userPoolResourceServerName.orNull)
      .build()
}
