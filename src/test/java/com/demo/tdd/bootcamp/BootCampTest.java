package com.demo.tdd.bootcamp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BootCampTest {

  @Test
  public void testCountOffNormalNumber() {
    BootCamp bootCamp = new BootCamp(3, 5, 7);

    assertEquals("2", bootCamp.countOff(2));
  }

  @Test
  public void testCountOffTimesOfFirstSpecialNumber() {
    BootCamp bootCamp = new BootCamp(3, 5, 7);

    assertEquals("Fizz", bootCamp.countOff(3));
    assertEquals("Fizz", bootCamp.countOff(6));
  }

  @Test
  public void testCountOffTimesOfOneSpecialNumber() {
    BootCamp bootCamp = new BootCamp(3, 5, 7);

    assertEquals("Buzz", bootCamp.countOff(25));
    assertEquals("Whizz", bootCamp.countOff(28));
  }
}
