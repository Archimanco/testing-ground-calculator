package org.example.mathdevices;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class MiniWindowsFreeCalculatorTest {

    private MiniWindowsFreeCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new MiniWindowsFreeCalculator();
    }

    @Test void testCalculatorGetValueAsString_erasesLeadingZeroes() {
        calculator.storedValue = 000045f;
        assertThat("Given 000045 Calculator shows a value of 45",calculator.getValueAsString(),is("45"));
    }

    @Test void testCalculatorGetValueAsString_erasesTrailingZeroes() {
        calculator.storedValue = 5.000000000f;
        assertThat("Given 5.000000000 Calculator shows a value of 5",calculator.getValueAsString(),is("5"));
    }

    @Test void testCalculatorGetValueAsString_allowsFloatingNumbers() {
        calculator = new MiniWindowsFreeCalculator();
        calculator.storedValue = 5.01234f;
        assertThat("Given 5.01234 Calculator shows a value of 5.01234",calculator.getValueAsString(),is("5.01234"));
    }

    @Test void testCalculatorWithGivenValue_yieldsExpectedOutput() {
        calculator.storedValue = 9f;
        assertThat("Calculator shows a value of 9",calculator.getValueAsString(),is("9"));
        calculator.storedValue = 0.1f;
        assertThat("Calculator shows a value of 0.1",calculator.getValueAsString(),is("0.1"));
    }

    @Test
    void testAddGivenValue_yieldsExpectedOutput() {
        calculator.addValue(4f);
        assertThat("0 + 4",calculator.getValueAsString(),is("4"));
    }

    @Test
    void testSubstractGivenValue_yieldsExpectedOutput() {
        calculator.storedValue = 3f;
        calculator.substractValue(4f);
        assertThat("3 - 4",calculator.getValueAsString(),is("-1"));
        calculator.storedValue = 0f;
        calculator.substractValue(0.3f);
        assertThat("0 -0.3",calculator.getValueAsString(),is("-0.3"));
    }

    @Test
    void multiplyByGivenValue_YieldsExpectedOuput() {
        calculator.storedValue = 3f;
        calculator.multiplyBy(3f);
        assertThat("3 * 3",calculator.getValueAsString(),is("9"));
        calculator.storedValue = 3f;
        calculator.multiplyBy(-0.1f);
        assertThat("3 * -0.1",calculator.getValueAsString(),is("-0.3"));
    }

    @Test
    void testDivideByZero_yieldsErrAsValue() {
        calculator.divideBy(0f);
        assertThat("divide by 0",calculator.getValueAsString(),is("Err"));
    }
}
