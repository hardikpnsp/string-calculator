package com.hardikpnsp.string_calculator;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringCalculatorTest {

    private String inputString;
    private int expectedOutput;
    private String testCaseExplaination;

    public StringCalculatorTest(String inputString, int expectedOutput, String testCaseExplaination){
        this.inputString = inputString;
        this.expectedOutput = expectedOutput;
        this.testCaseExplaination = testCaseExplaination;
    }

    @Parameterized.Parameters
    public static List<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
            {"", 0, "Empty string should return 0"},
            {"42", 42, "Single digit string should return the digit itself"},
            {"1,1", 2, "String with ',' as delimiter should return sum of the digits seperated by ','"},
            {"10,20,30,40,50", 150, "String with n comma seperated numbers should return sum of all numbers"}
        });
    }

    @Test
    public void testAdd(){
        assertEquals(testCaseExplaination, expectedOutput, StringCalculator.add(inputString));
    }
}