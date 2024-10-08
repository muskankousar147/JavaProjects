package com.xworkz.exceptions.runner;

public class ExceptionRunner {

	public static void main(String[] args) {
		//try resource
    Exception exception = new Exception();
    try {
    	System.out.println("try block is invkoing");
    }
   catch (Scanner scanner = new Scanner(System.in)){
    	System.out.println("resource block is invoking");
    }
	}

}
