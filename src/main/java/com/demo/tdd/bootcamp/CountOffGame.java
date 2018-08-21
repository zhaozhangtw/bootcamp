package com.demo.tdd.bootcamp;

import java.util.Scanner;

public class CountOffGame {

  public static void main(String[] args) {
    System.out.println("Give three different special number in the range [1, 9]");
    System.out.println("Separated by ',' and exit by 'E' or 'exit'");

    while (true) {
      try {
        String line = new Scanner(System.in).useDelimiter(System.getProperty("line.separator")).next();
        if (line.equals("e") || line.equals("exit")) {
          break;
        }

        String[] inputs = line.split(",");
        GameRule gameRule = new GameRule(Integer.valueOf(inputs[0]), Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2]));
        for (int i = 0; i <= 100; i++) {
          System.out.println(gameRule.countOff(i));
        }
        System.out.println("Please input again");
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println("Please input again");
      }
    }
  }
}
