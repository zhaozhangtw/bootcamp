package com.demo.tdd.bootcamp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BootCampTest {

  @Test
  public void testCountOffNormalNumber() {
    BootCamp bootCamp = new BootCamp(3);

    assertEquals("2", bootCamp.countOff(2));
  }

  @Test
  public void testCountOffTimesOfFirstSpecialNumber() {
    BootCamp bootCamp = new BootCamp(3);

    assertEquals("Fizz", bootCamp.countOff(3));
    assertEquals("Fizz", bootCamp.countOff(6));
  }
}
