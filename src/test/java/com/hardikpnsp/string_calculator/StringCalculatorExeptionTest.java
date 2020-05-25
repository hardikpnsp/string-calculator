package com.hardikpnsp.string_calculator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringCalculatorExeptionTest {
    
    private String inputString;
    private String exceptionMessage;

    public StringCalculatorExeptionTest(String inputString, String exceptionMessage){
        this.inputString = inputString;
        this.exceptionMessage = exceptionMessage;
    }

    @Parameterized.Parameters
    public static List<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
            {"-1", "Negative numbers encountered in input: [-1]"},
            {"1,-1", "Negative numbers encountered in input: [-1]"},
            {"2,3,-4,5", "Negative numbers encountered in input: [-4]"},
            {"-1,-2,-3,-4", "Negative numbers encountered in input: [-1, -2, -3, -4]"}
        });
    }
    @Test(expected = NegativeNotAllowedException.class)
    public void testAddNegativeNumbers() throws NegativeNotAllowedException{
        StringCalculator.add(inputString);
    }

    @Test
    public void testAddExceptionMessage(){
        try {
            StringCalculator.add(inputString);
        } catch (NegativeNotAllowedException e) {
            assertEquals(exceptionMessage, e.getMessage());
        }
    }
}