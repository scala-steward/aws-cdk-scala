package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientVpnEndpointOptions {

  def apply(
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    logging: Option[Boolean] = None,
    cidr: Option[String] = None,
    clientConnectionHandler: Option[software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler] = None,
    userBasedAuthentication: Option[software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    port: Option[software.amazon.awscdk.services.ec2.VpnPort] = None,
    logStream: Option[software.amazon.awscdk.services.logs.ILogStream] = None,
    dnsServers: Option[List[String]] = None,
    description: Option[String] = None,
    transportProtocol: Option[software.amazon.awscdk.services.ec2.TransportProtocol] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    serverCertificateArn: Option[String] = None,
    authorizeAllUsersToVpcCidr: Option[Boolean] = None,
    selfServicePortal: Option[Boolean] = None,
    splitTunnel: Option[Boolean] = None,
    clientCertificateArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions =
    (new software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions.Builder)
      .logGroup(logGroup.orNull)
      .logging(logging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cidr(cidr.orNull)
      .clientConnectionHandler(clientConnectionHandler.orNull)
      .userBasedAuthentication(userBasedAuthentication.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .port(port.orNull)
      .logStream(logStream.orNull)
      .dnsServers(dnsServers.map(_.asJava).orNull)
      .description(description.orNull)
      .transportProtocol(transportProtocol.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .serverCertificateArn(serverCertificateArn.orNull)
      .authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .selfServicePortal(selfServicePortal.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .splitTunnel(splitTunnel.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clientCertificateArn(clientCertificateArn.orNull)
      .build()
}
