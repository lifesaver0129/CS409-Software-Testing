package com.bradteachescode.basiccalculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    double delta = 0.001;
    MainActivity mainActivity = new MainActivity();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /* Initial test for TDD */
    @Test
    public void decimalTest() {
        double number1 = 1.5, number2 = 3.0;
        assertEquals(4.5, mainActivity.add(number1, number2), delta);
    }

    @Test
    public void add() {
        double number1 = 2.5, number2 = 3.0;
        assertEquals(5.5, mainActivity.add(number1, number2), delta);
    }

    @Test
    public void substract() {
        double number1 = 12.5, number2 = 3.0;
        assertEquals(9.5, mainActivity.substract(number1, number2), delta);
    }

    @Test
    public void multi() {
        double number1 = 1.5, number2 = 3.0;
        assertEquals(4.5, mainActivity.multi(number1, number2), delta);
    }

    @Test
    public void divide() {
        double number1 = 12.4, number2 = 3.1;
        assertEquals(4.0, mainActivity.divide(number1, number2), delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptional() {
        double number1 = 10.4, number2 = 0;
        assertEquals(4.0, mainActivity.divide(number1, number2), delta);
    }

    @Test(expected = NumberFormatException.class)
    public void invalidInputs() {
        double number1 = 10.4;
        String number2 = "abc";
        assertEquals(4.0, mainActivity.divide(number1, Double.parseDouble(number2)), delta);
    }

}

