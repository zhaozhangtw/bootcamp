package com.demo.tdd.bootcamp;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GameRuleTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

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

  @Test
  public void testInputInvalidRangeSpecialNumber() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("special number 0 must be in range [1, 9]");
    new GameRule(0, 5, 7);

    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("special number 10 must be in range [1, 9]");
    new GameRule(0, 10, 7);
  }

  @Test
  public void testSameSpecialNumber() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("special number must be different each other");
    new GameRule(3, 3, 7);
  }
}
