package com.patterns.factory_method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.util.EnumSet;
import java.util.Set;

class EnumSetTest {

  @Test
  void test() {
//    given
    EnumSet<DayOfWeek> dayOfWeekEnumSet = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY);
//    then
    Assertions.assertTrue(dayOfWeekEnumSet instanceof Set);
    Assertions.assertEquals(2, dayOfWeekEnumSet.size());
  }

  @Test
  void test2() {
//    given
    EnumSet<DayOfWeek> dayOfWeekEnumSet = EnumSet.range(DayOfWeek.MONDAY, DayOfWeek.THURSDAY);
//    then
    Assertions.assertTrue(dayOfWeekEnumSet instanceof Set);
    Assertions.assertEquals(4, dayOfWeekEnumSet.size());
  }
}
