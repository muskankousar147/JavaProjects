package com.xworkz.exceptionhandling.runner;

public class IllegalStateExceptionRunner {

	public static void main(String[] args) {
		String state = "";
		try {
			throw new IllegalStateException("Illegal state!");
		}catch(Exception message) {
			 System.out.println("output:" +message.getMessage());		}
	}

}
