package com.xworkz.exceptions;

public class NumberException extends Throwable {
	 public void processNumber(int number) throws Exception {
	        if (number < 1 || number > 30) {
	            throw new Exception("Number should be between 1 and 30:" +number);
	        }
	        System.out.println("Processing number: " + number);
	    }
}
