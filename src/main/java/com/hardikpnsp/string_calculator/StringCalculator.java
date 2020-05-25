package com.hardikpnsp.string_calculator;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String numbers) throws NegativeNotAllowedException{
        if(numbers.isEmpty()){
            return 0;
        }else{
            String delimiterPattern = ",|\n";
            String exceptionMessage = "Negative numbers encountered in input: ";
            Vector<Integer> negativeNumbers = new Vector<Integer>();
            int answer = 0;
            
            if(numbers.startsWith("//")){
                String[] temp = numbers.split("\n", 2);
                String extra_delimiter = temp[0].substring(2);
                numbers = temp[1];

                if (extra_delimiter.startsWith("[")){
                    Pattern p = Pattern.compile("\\[(.*?)\\]");
                    Matcher m = p.matcher(extra_delimiter);
                    while(m.find()){
                        delimiterPattern += "|\\Q" + m.group(1) + "\\E";
                    }
                }else{
                    delimiterPattern += "|" + extra_delimiter;
                }
            }

            String[] numTokens = numbers.split(delimiterPattern);
            for (String num : numTokens){
                int n = Integer.parseInt(num);
                if(n < 0){
                    negativeNumbers.add(n);
                }else if (n <= 1000){
                    answer += n;
                }
            }

            if(negativeNumbers.isEmpty()){
                return answer;
            }else{
                throw new NegativeNotAllowedException(exceptionMessage + negativeNumbers.toString());
            }
        }
    }
}