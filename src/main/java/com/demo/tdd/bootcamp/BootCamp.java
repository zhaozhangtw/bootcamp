package com.demo.tdd.bootcamp;

public class BootCamp {

  private final int firstSpecial;

  public BootCamp(int firstSpecial) {
    this.firstSpecial = firstSpecial;
  }

  public String countOff(int count) {
    if (count % firstSpecial == 0) {
      return "Fizz";
    }

    return count + "";
  }
}
