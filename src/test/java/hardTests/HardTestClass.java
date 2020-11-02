package hardTests;

import application.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HardTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - divide by zero case

  @Test
  public void additionnWithMultipleParameters() {
    int actualResult = calc.AdditionnWithMultipleParameters(30, 30, 30);
    assertEquals("", 90, actualResult);
  }
  //TODO (**)
  //add tests for new method - addition with multiple parameters

  @Test

  public void divisionByZero(){
    int actualResult = calc.divisionByZero(10, 0);
    assertEquals("", -100, actualResult);
  }
}
