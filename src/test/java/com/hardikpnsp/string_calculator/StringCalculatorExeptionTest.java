package com.hardikpnsp.string_calculator;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringCalculatorExeptionTest {
    
    private String inputString;

    public StringCalculatorExeptionTest(String inputString){
        this.inputString = inputString;
    }

    @Parameterized.Parameters
    public static List<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
            {"-1"},
        });
    }
    @Test(expected = NegativeNotAllowedException.class)
    public void testAddNegativeNumbers() throws NegativeNotAllowedException{
        StringCalculator.add(inputString);
    }
}