package com.patterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

class StringBuilderTest {

  @Test
  void stringBuilderUsageExample() {
//    given
    StringBuilder stringBuilder = new StringBuilder();
    AtomicReference<String> string = new AtomicReference<>("");
    int amountOfAppends = 10000;
//then
    Assertions.assertTimeout(Duration.ofMillis(100),
            () -> appendMultipleTimesToStringBuilder(stringBuilder, amountOfAppends),
            "Assert that execution time is less than 100 millis");
    Assertions.assertTimeout(Duration.ofMillis(1000),
            () -> appendMultipleTimesToString(string, amountOfAppends),
            "Assert that execution time is less than 1000 millis");
    Assertions.assertEquals(stringBuilder.toString(), string.toString(), "Assert that both object are the same");
  }

  private void appendMultipleTimesToStringBuilder(StringBuilder stringBuilder, int amountOfAppends) {
    IntStream.range(0, amountOfAppends).forEach(stringBuilder::append);
  }

  private void appendMultipleTimesToString(AtomicReference<String> string, int amountOfAppends) {
    IntStream.range(0, amountOfAppends).forEach(index -> string.updateAndGet(v -> v + index));
  }
}
