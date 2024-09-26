package com.xworkz.exceptionhandling.runner;

public class IndexOutOfBondExceptionRunner {

	public static void main(String[] args) {
		try {
			 String[] array = new String[2];
		        System.out.println(array[3]);
		}catch(Exception message) {
			System.out.println("output is:"+message.getMessage());
		}

	}

}
