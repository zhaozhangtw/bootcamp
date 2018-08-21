package com.demo.tdd.bootcamp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameRuleTest {

  @Test
  public void testCountOffNormalNumber() {
    GameRule gameRule = new GameRule(3, 5, 7);

    assertEquals("2", gameRule.countOff(2));
  }

  @Test
  public void testCountOffTimesOfFirstSpecialNumber() {
    GameRule gameRule = new GameRule(3, 5, 7);

    assertEquals("Fizz", gameRule.countOff(3));
    assertEquals("Fizz", gameRule.countOff(6));
  }

  @Test
  public void testCountOffTimesOfOneSpecialNumber() {
    GameRule gameRule = new GameRule(3, 5, 7);

    assertEquals("Buzz", gameRule.countOff(25));
    assertEquals("Whizz", gameRule.countOff(28));
  }

  @Test
  public void testCountOffTimesOfMultipleSpecialNumber() {
    GameRule gameRule = new GameRule(3, 5, 7);

    assertEquals("FizzBuzz", gameRule.countOff(3 * 5));
    assertEquals("FizzWhizz", gameRule.countOff(3 * 7));
    assertEquals("FizzBuzzWhizz", gameRule.countOff(3 * 5 * 7));
  }

  @Test
  public void testCountOffIncludeSpecialNumber() {
    GameRule gameRule = new GameRule(3, 5, 7);

    assertEquals("Fizz", gameRule.countOff(13));
    assertEquals("Fizz", gameRule.countOff(35));
  }
}
