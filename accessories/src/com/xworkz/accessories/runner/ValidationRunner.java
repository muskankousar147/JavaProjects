package com.xworkz.accessories.runner;

import java.util.Arrays;

public class ValidationRunner {

	public static void main(String[] args) {
		String value = "Happy birthday dear";
		char[] ch = value.toCharArray();
		System.out.println(ch.length);
		
		//first letter should be capital
		System.out.println(Character.isUpperCase(value.charAt(0)));
		
		//last letter should be small
		System.out.println(Character.isLowerCase(value.charAt(18)));
		System.out.println(Arrays.toString(ch));
		
		
		//10th letter should be lower case
		System.out.println(Character.isLowerCase(value.charAt(10)));
		
		//3rd letter should be digit
		System.out.println(Character.isLowerCase(3));
		
		
		//password should be >=8 and <=16 null check,
		String password = "MuS41499k@gmail.com";
		if(password!=null&& password.length()>=8 && password.length()<=16) {
			char[] data = password.toCharArray();
			System.out.println(data.length);
			
			if(Character.isLowerCase(password.charAt(15)));
			if(Character.isDigit(4)) {
				System.out.println("result");
			}
			
			//password is alphanumeric or not
			
			//if(Character.isDigit(2)) {
				//for(String mk : char) {
					
				}
			}
			
			
		//}
	}

//}
