package com.xworkz.exceptionhandling.runner;

public class ArithmaticExceptionRunner {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a/0;
			System.out.println("output: "+a);
		} catch(ArithmeticException abc) {
			throw new ArithmeticException("zero cannt be divide by any number");
		}
	}


	}

