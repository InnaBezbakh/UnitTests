package mediumTests;

import application.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediumTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - average value


  @Test
  public void testReturnEvenOrOdd() {
    boolean actualResult = calc.everOrOdd(3);
    assertEquals("true if number is even and false if number is Odd", false, actualResult);
  }

  //TODO (**)
  //add tests for new method - even or odd
  @Test
  public void testAverageNumberOfThree() {
    double actualResult = calc.aver(3, 3, 3);
    assertEquals("3+3+3 / 3 must be 3", 3, actualResult, 3);
  }


  //TODO (**)
  //add tests for new method - biggest value
  @Test
  public void testDivisionByZero() {
    int actualResult = calc.divisionByZero(5, 0);
    assertEquals("",-100, actualResult);
  }

}
