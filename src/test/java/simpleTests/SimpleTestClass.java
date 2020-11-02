package simpleTests;

import application.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void testMultTwoPositiveValues() {
        int actualResult = calc.mult(10, 5);
        assertEquals("10 * 5 must be 50", 50, actualResult);
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        double actualResult = calc.division(10, 5);
        assertEquals("10/5 must be 2", 2, actualResult, 2);
    }

    @Test
    public void testSquareRootTwoPositiveValues() {
        double actualResult = calc.squareRoot(4);
        assertEquals("squareRoot from 4 must be 2", 2, actualResult, 2);
    }

    @Test
    public void testRootTwoPositive() {
        int actualResult = calc.stepin(2);
        assertEquals("stepin", 4, actualResult, 4);
    }

    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)


}
