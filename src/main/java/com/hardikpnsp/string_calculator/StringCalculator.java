package com.hardikpnsp.string_calculator;

public class StringCalculator {
    public static int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }else{
            return Integer.parseInt(numbers);
        }
    }
}