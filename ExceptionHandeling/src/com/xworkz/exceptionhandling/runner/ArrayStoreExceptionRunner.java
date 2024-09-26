package com.xworkz.exceptionhandling.runner;

public class ArrayStoreExceptionRunner {

	public static void main(String[] args) {
		try {
			Object[] objArray = new String[5];
		        objArray[0] = new Integer(10); 
		}catch(Exception message) {
			System.out.println("array stored exception");
		}
	}

}
