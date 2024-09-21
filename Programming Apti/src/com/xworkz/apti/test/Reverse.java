package com.xworkz.apti.test;

import java.util.Scanner;

public class Reverse {
	public void originalValue(String originalValue){
		System.out.println("original value is:"+originalValue);
		if(originalValue != null){
		for(int i=originalValue.length()-1; i>=0; i--){
			//System.out.println("enter the array");
			System.out.println(originalValue.charAt(i));
		}	
		}else {
			System.out.println("enter the proper value:" +originalValue);
		}

		}
	
	public static void main(String args[]) {
		Reverse value = new Reverse();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the array");
		value.originalValue(scanner.nextLine());
	}
}
