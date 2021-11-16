package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnEndpointOptions {

  def apply(
    cidr: String,
    serverCertificateArn: String,
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    logging: Option[Boolean] = None,
    clientConnectionHandler: Option[software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler] = None,
    userBasedAuthentication: Option[software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    port: Option[software.amazon.awscdk.services.ec2.VpnPort] = None,
    logStream: Option[software.amazon.awscdk.services.logs.ILogStream] = None,
    dnsServers: Option[List[String]] = None,
    description: Option[String] = None,
    transportProtocol: Option[software.amazon.awscdk.services.ec2.TransportProtocol] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    authorizeAllUsersToVpcCidr: Option[Boolean] = None,
    selfServicePortal: Option[Boolean] = None,
    splitTunnel: Option[Boolean] = None,
    clientCertificateArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions =
    (new software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions.Builder)
      .cidr(cidr)
      .serverCertificateArn(serverCertificateArn)
      .logGroup(logGroup.orNull)
      .logging(logging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clientConnectionHandler(clientConnectionHandler.orNull)
      .userBasedAuthentication(userBasedAuthentication.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .port(port.orNull)
      .logStream(logStream.orNull)
      .dnsServers(dnsServers.map(_.asJava).orNull)
      .description(description.orNull)
      .transportProtocol(transportProtocol.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .selfServicePortal(selfServicePortal.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .splitTunnel(splitTunnel.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clientCertificateArn(clientCertificateArn.orNull)
      .build()
}
