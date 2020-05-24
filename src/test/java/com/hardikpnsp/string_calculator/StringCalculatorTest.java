package com.hardikpnsp.string_calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void testAdd(){
        assertEquals(0, StringCalculator.add(""));
        assertEquals(42, StringCalculator.add("42"));
    }
}