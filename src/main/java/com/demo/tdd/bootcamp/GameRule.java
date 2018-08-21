package com.demo.tdd.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class GameRule {

  private static final String[] specialFlag = new String[]{"Fizz", "Buzz", "Whizz"};

  private List<Integer> specials = new ArrayList<>();

  public GameRule(int firstSpecial, int secondSpecial, int thirdSpecial) {
    specials.add(firstSpecial);
    specials.add(secondSpecial);
    specials.add(thirdSpecial);
  }

  public String countOff(int count) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < specials.size(); i++) {
      if (String.valueOf(count).contains(String.valueOf(specials.get(0)))) {
        return specialFlag[i];
      }
      if (count % specials.get(i) == 0) {
        result.append(specialFlag[i]);
      }
    }

    return result.length() != 0
        ? result.toString()
        : String.valueOf(count);
  }
}
