package com.hardikpnsp.string_calculator;

public class StringCalculator {
    public static int add(String numbers) throws NegativeNotAllowedException{
        if(numbers.isEmpty()){
            return 0;
        }else{
            String delimiterPattern = ",|\n";
            if(numbers.startsWith("//")){
                String[] temp = numbers.split("\n", 2);
                String extra_delimiter = temp[0].substring(2);
                numbers = temp[1];
                delimiterPattern += "|" + extra_delimiter;
            }
            String[] numTokens = numbers.split(delimiterPattern);
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