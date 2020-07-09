package edu.pdx.cs410J.JavaKataTeamOne;

import java.util.*;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static TreeMap<Integer, String> h;

  public Kata() {
    h = new TreeMap<Integer, String>(Collections.reverseOrder());
    h.put(1,"I");
    h.put(4,"IV");
    h.put(5,"V");
    h.put(9,"IX");
    h.put(40,"XL");
    h.put(90,"XC");
    h.put(400,"CD");
    h.put(900,"CM");
    h.put(10,"X");
    h.put(50,"L");
    h.put(100,"C");
    h.put(500,"D");
    h.put(1000,"M");
  }


  public static void main(String[] args) {
    Kata kata = new Kata();
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
    }
    for (String number : args) {
      System.out.println(kata.romanNumeralFor(Integer.parseInt(number)));
    }
    System.exit(1);
  }

  public static String romanNumeralFor(int number) {
    StringBuilder string = new StringBuilder();
      for (int n : h.keySet()) {
        while (number >= n) {
          string.append(h.get(n));
          number-=n;
        }
      }

    return string.toString();
  }
}