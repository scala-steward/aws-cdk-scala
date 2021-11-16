package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCompositeAlarmProps {

  def apply(
    alarmRule: String,
    alarmName: String,
    insufficientDataActions: Option[List[String]] = None,
    okActions: Option[List[String]] = None,
    actionsEnabled: Option[Boolean] = None,
    alarmActions: Option[List[String]] = None,
    alarmDescription: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps.Builder)
      .alarmRule(alarmRule)
      .alarmName(alarmName)
      .insufficientDataActions(insufficientDataActions.map(_.asJava).orNull)
      .okActions(okActions.map(_.asJava).orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmActions(alarmActions.map(_.asJava).orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
