package com.hardikpnsp.string_calculator;

@SuppressWarnings("serial")
public class NegativeNotAllowedException extends Exception {
	NegativeNotAllowedException(String errorMessage){
        super(errorMessage);
    }
}