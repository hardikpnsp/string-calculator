package com.hardikpnsp.string_calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter String Sequence to calculate Addition: " );
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        in.close();
    
        inputString = inputString.replace("\\n", "\n");

        int answer;
		try {
			answer = StringCalculator.add(inputString);
            System.out.println("Answer: " + answer);
		} catch (NegativeNotAllowedException e) {
            System.out.println(e.getMessage());
			System.out.println("Please do not enter negative numbers");
		}
    }
}
