package com.demo.tdd.bootcamp;

public class BootCamp {

  public BootCamp(int firstSpecial) {

  }

  public String countOff(int count) {
    if (count % 3 == 0) {
      return "Fizz";
    }

    return count + "";
  }
}
