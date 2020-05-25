package com.hardikpnsp.string_calculator;

public class NegativeNotAllowedException extends Exception {
	NegativeNotAllowedException(String errorMessage){
        super(errorMessage);
    }
}