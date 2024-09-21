package com.xworkz.apti.test;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		String userinput = scanner.nextLine();
		
		if(isNumber(userinput)) {
			
			System.out.println("user input is number: "+userinput);
			
		}else {
			System.out.println("user input is not a number");
		}
	}

	private static boolean isNumber(String userinput) {
		if(userinput == userinput) {
			System.out.println("valid input number");
			return true;
		}else {
			System.out.println("is not a valid number");
		}
		return false;
	}

}
