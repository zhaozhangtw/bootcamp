package com.demo.tdd.bootcamp;

public class BootCamp {

  private final int firstSpecial;
  private final int secondSpecial;
  private final int thirdSpecial;

  public BootCamp(int firstSpecial, int secondSpecial, int thirdSpecial) {
    this.firstSpecial = firstSpecial;
    this.secondSpecial = secondSpecial;
    this.thirdSpecial = thirdSpecial;
  }

  public String countOff(int count) {
    if (count % firstSpecial == 0) {
      return "Fizz";
    }
    if (count % secondSpecial == 0) {
      return "Buzz";
    }
    if (count % thirdSpecial == 0) {
      return "Whizz";
    }

    return count + "";
  }
}
