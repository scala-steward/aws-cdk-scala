package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LookupMachineImageProps {

  def apply(
    name: Option[String] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    owners: Option[List[String]] = None,
    filters: Option[Map[String, _ <: List[String]]] = None,
    windows: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.LookupMachineImageProps =
    (new software.amazon.awscdk.services.ec2.LookupMachineImageProps.Builder)
      .name(name.orNull)
      .userData(userData.orNull)
      .owners(owners.map(_.asJava).orNull)
      .filters(filters.map(_.view.mapValues(_.asJava).toMap.asJava).orNull)
      .windows(windows.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
