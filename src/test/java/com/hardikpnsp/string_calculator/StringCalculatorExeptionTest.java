package com.hardikpnsp.string_calculator;

import org.junit.Test;

public class StringCalculatorExeptionTest {
    
    @Test(expected = NegativeNotAllowedException.class)
    public void testAddNegativeNumbers() throws NegativeNotAllowedException{
        StringCalculator.add("-1");
    }
}