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
            {"10,20,30,40,50", 150, "String with n comma seperated numbers should return sum of all numbers"},
            {"1\n2,3", 6, "String with delimiter '\\n' should be supported"},
            {"//;\n1;2", 3, "String with delimiter definition should seperate number with given delimiter"},
            {"///\n1/2/3", 6, "String with delimiter definition should seperate number with given delimiter"},
            {"//;\n1;2,3\n4", 10, "String with delimiter definition should still support ',' and '\\n' as delimiters"},
            {"2,1002", 2, "Numbers bigger than 1000 should be ignored"},
            {"10,20,1020", 30, "All numbers bigger than 1000 should be ignored"},
            {"//;\n1000;1000;1001", 2000, "Number bigger than 1000 should be ignored, 1000 should be counted"},
            {"//[***]\n1***2***3", 6, "Multi character delimiter should be supported with [] syntax"},
            {"//*\n1*2*3", 6, "Regex metacharacters should be supported as delimiter"},
            {"//[\n1[2[3", 6, "If string does not end with ']' then '[' should be considered a delimiter"},
            {"//[*][%]\n1*2%3", 6, "Multiple delimiter should be supported with multiple [] syntax"},
            {"//[**][;;][%%]\n1**2;;3%%4", 10, "Multiple multi character delimiter should be supported with [] syntax"}
        });
    }

    @Test
    public void testAdd(){
        try {
			assertEquals(testCaseExplaination, expectedOutput, StringCalculator.add(inputString));
		} catch (NegativeNotAllowedException e) {
			e.printStackTrace();
		}
    }
}