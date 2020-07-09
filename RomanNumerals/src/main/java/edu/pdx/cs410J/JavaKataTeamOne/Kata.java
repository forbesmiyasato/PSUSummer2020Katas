package edu.pdx.cs410J.JavaKataTeamOne;

import java.util.Hashtable;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static Hashtable<Integer, String> h;

  public Kata() {
    h = new Hashtable<Integer, String>();
    h.put(1,"I");
    h.put(5,"V");
    h.put(10,"X");
    h.put(50,"L");
    h.put(100,"C");
    h.put(500,"D");
    h.put(1000,"M");
  }


  public static void main(String[] args) {


    System.err.println("Missing command line arguments");
    System.exit(1);
  }


  public static String romanNumeralFor(int number) {
    if (number == 1) { return ("I"); }
    if (number == 4) { return ("IV"); }
    if (number == 5) { return ("V"); }
    if (number == 13) {
      for (int n : h.keySet()) {
        if (number > n)
      }
    }
    return "none";
  }
}