package edu.pdx.cs410J.miyasato;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void testRPNCalculator() {
      Kata kata = new Kata();

      assertThat(kata.RPN("20", "5", "/"), equalTo(4));
  }

  @Test
  public void testRPNCalculator2() {
        Kata kata = new Kata();
        assertThat(kata.RPN("20", "4", "*"), equalTo(80));
  }

  @Test
  public void testRPNCalculator3() {
        Kata kata = new Kata();
        assertThat(kata.RPN("20", "4", "+"), equalTo(24));
  }

  @Test
  public void testRPNCalculator4() {
        Kata kata = new Kata();
        assertThat(kata.RPN("20", "4", "-"), equalTo(16));
  }

  @Test
  public void testRPNCalculator5() {
        Kata kata = new Kata();
        assertThat(kata.RPN("4", "2", "+", "7", "-"), equalTo(-1));
  }
}
