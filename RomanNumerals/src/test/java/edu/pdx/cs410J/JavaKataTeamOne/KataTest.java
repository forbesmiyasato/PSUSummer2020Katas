package edu.pdx.cs410J.JavaKataTeamOne;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void romanNumforOneisI() {
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }

  @Test
  public void romanNumforFourisIV() {
    assertThat(Kata.romanNumeralFor(4), equalTo("IV"));
  }

  @Test
  public void romanNumforFiveisV() {
    assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }
}
