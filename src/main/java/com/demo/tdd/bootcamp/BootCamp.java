package com.demo.tdd.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class BootCamp {

  private static final String[] specialFlag = new String[]{"Fizz", "Buzz", "Whizz"};

  private List<Integer> specials = new ArrayList<>();

  public BootCamp(int firstSpecial, int secondSpecial, int thirdSpecial) {
    specials.add(firstSpecial);
    specials.add(secondSpecial);
    specials.add(thirdSpecial);
  }

  public String countOff(int count) {
    for (int i = 0; i < specials.size(); i++) {
      if (count % specials.get(i) == 0) {
        return specialFlag[i];
      }
    }

    return count + "";
  }
}
