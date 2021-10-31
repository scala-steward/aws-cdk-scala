package io.burkard.cdk.services.appsync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGraphQLApi {

  def apply(
    internalResourceId: String,
    xrayEnabled: Option[Boolean] = None,
    tags: Option[List[_]] = None,
    logConfig: Option[software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty] = None,
    openIdConnectConfig: Option[software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty] = None,
    additionalAuthenticationProviders: Option[List[_]] = None,
    name: Option[String] = None,
    authenticationType: Option[String] = None,
    lambdaAuthorizerConfig: Option[software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty] = None,
    userPoolConfig: Option[software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appsync.CfnGraphQLApi =
    software.amazon.awscdk.services.appsync.CfnGraphQLApi.Builder
      .create(stackCtx, internalResourceId)
      .xrayEnabled(xrayEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .logConfig(logConfig.orNull)
      .openIdConnectConfig(openIdConnectConfig.orNull)
      .additionalAuthenticationProviders(additionalAuthenticationProviders.map(_.asJava).orNull)
      .name(name.orNull)
      .authenticationType(authenticationType.orNull)
      .lambdaAuthorizerConfig(lambdaAuthorizerConfig.orNull)
      .userPoolConfig(userPoolConfig.orNull)
      .build()
}
