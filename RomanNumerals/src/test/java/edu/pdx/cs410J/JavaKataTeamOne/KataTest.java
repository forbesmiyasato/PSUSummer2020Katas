package edu.pdx.cs410J.JavaKataTeamOne;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{
  Kata Kata = new Kata();
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

  @Test
  public void romanNumforTenisX() {
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void romanNumforThirteenisXIII() {
    assertThat(Kata.romanNumeralFor(13), equalTo("XIII"));
  }

  @Test
  public void romanNumfor44isXLIV() {
    assertThat(Kata.romanNumeralFor(44), equalTo("XLIV"));
  }

  @Test
  public void romanNumfor444isCDXLIV() {
    assertThat(Kata.romanNumeralFor(444), equalTo("CDXLIV"));
  }

  @Test
  public void romanNumfor3000isMMM() {
    assertThat(Kata.romanNumeralFor(3000), equalTo("MMM"));
  }

  @Test
  public void romanNumfor0isEmpty() {
    assertThat(Kata.romanNumeralFor(0), equalTo(""));
  }

  @Test
  public void romanNumfor2944isMMCMXLIV() {
    assertThat(Kata.romanNumeralFor(2944), equalTo("MMCMXLIV"));
  }
}
