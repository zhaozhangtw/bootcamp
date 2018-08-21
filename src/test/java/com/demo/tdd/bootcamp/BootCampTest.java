package com.demo.tdd.bootcamp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BootCampTest {

  @Test
  public void testCountOffNormalNumber() {
    BootCamp bootCamp = new BootCamp();

    assertEquals("2", bootCamp.countOff(2));
  }
}
