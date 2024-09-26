package com.xworkz.exceptionhandling.runner;

public class NumberFormatExceptionRunner {

	public static void main(String[] args) {
		int number = 234;
		try {
			int numbers = Integer.parseInt("abcd"); 
			System.out.println("result");
		}catch(NumberFormatException message) {
			System.out.println("number format exception:" +message.getMessage());
		}

	}

}
