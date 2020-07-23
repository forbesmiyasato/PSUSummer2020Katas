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
}
