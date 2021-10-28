package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupSelectionResourceTypeProperty {

  def apply(
    iamRoleArn: Option[String] = None,
    selectionName: Option[String] = None,
    resources: Option[List[String]] = None,
    listOfTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder)
      .iamRoleArn(iamRoleArn.orNull)
      .selectionName(selectionName.orNull)
      .resources(resources.map(_.asJava).orNull)
      .listOfTags(listOfTags.map(_.asJava).orNull)
      .build()
}
