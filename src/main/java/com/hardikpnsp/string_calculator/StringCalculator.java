package com.hardikpnsp.string_calculator;

public class StringCalculator {
    public static int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }else{
            String[] numTokens = numbers.split(",|\n");
            if(numTokens.length == 1){
                return Integer.parseInt(numbers);
            }else{
                int answer = 0;
                for (String num : numTokens){
                    answer += Integer.parseInt(num);
                }
                return answer;
            }
        }
    }
}