package com.hardikpnsp.string_calculator;
/*
* Exception thrown when negative numbers are encountered
* in Addition
*/
@SuppressWarnings("serial")
public class NegativeNotAllowedException extends Exception {
    /**
     * 
     * @param errorMessage message with comma seperated list of negative numbers that occured
     * 
     */
	NegativeNotAllowedException(String errorMessage){
        super(errorMessage);
    }
}