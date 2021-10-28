package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CronOptions {

  def apply(
    minute: Option[String] = None,
    year: Option[String] = None,
    hour: Option[String] = None,
    day: Option[String] = None,
    weekDay: Option[String] = None,
    month: Option[String] = None
  ): software.amazon.awscdk.services.events.CronOptions =
    (new software.amazon.awscdk.services.events.CronOptions.Builder)
      .minute(minute.orNull)
      .year(year.orNull)
      .hour(hour.orNull)
      .day(day.orNull)
      .weekDay(weekDay.orNull)
      .month(month.orNull)
      .build()
}
