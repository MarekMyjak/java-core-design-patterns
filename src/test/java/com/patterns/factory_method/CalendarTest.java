package com.patterns.factory_method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarTest {

  @Test
  void testDefaultCalendar() {
//    given
    Calendar defaultCalendarInstance = Calendar.getInstance();
//    then
    Assertions.assertEquals(TimeZone.getDefault(), defaultCalendarInstance.getTimeZone());
  }

  @Test
  void testCalendarWithSpecificZone() {
//    given
    Calendar calendarWithSpecificZone = Calendar.getInstance(TimeZone.getTimeZone("ECT"));
//    then
    Assertions.assertEquals(calendarWithSpecificZone.getTimeZone(), TimeZone.getTimeZone("ECT"));
  }

  @Test
  void testCalendarWithSpecificLocale() {
//    given
    Calendar calendarWithSpecificLocale = Calendar.getInstance(Locale.TRADITIONAL_CHINESE);
//    then
    Assertions.assertEquals(TimeZone.getDefault(), calendarWithSpecificLocale.getTimeZone());
  }

  @Test
  void testCalendarWithSpecificTimeZoneAndLocale() {
//    given
    Calendar calendarWithSpecificTimeZoneAndLocale = Calendar.getInstance(TimeZone.getTimeZone("ECT"), Locale.ENGLISH);
//    then
    Assertions.assertEquals(TimeZone.getTimeZone("ECT"), calendarWithSpecificTimeZoneAndLocale.getTimeZone());
  }
}
