package com.xworkz.apti.test;

import java.util.Scanner;

public class Palindrome {
public void originalValue(String originalValue) {
	if(originalValue != null) {
		char c[] = originalValue.toCharArray();
		String reverseValue = " ";
		for(char s : c) {
			reverseValue = c + reverseValue;
			System.out.println("original value is:" +reverseValue);
			if(originalValue.equals(reverseValue)) {
				System.out.println("it is palindrome value");
			}else {
				System.out.println("it is not a palindrome value");
			}
				
			System.out.println("entered value is palindrome: "+originalValue);
			
		}
	}
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Palindrome String = new Palindrome();
		System.out.println("enter the value");
		String.originalValue(scanner.nextLine());
	
	}

}
