package com.xworkz.test9;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[3];

	        //loop to read the integers from the user
	        for (int i = 0; i < numbers.length; i++) {
	        	//while for testing the valid integer is given by the user
	            while(true){
	                System.out.print("Enter integer" + (i + 1) + ": ");
	                String input = scanner.nextLine();
	                //try catch block for exception handling
	                try {
	                    numbers[i] = Integer.parseInt(input);
	                    break;
	                } catch (NumberFormatException e) {
	                    e.printStackTrace();
	                   	            }
	        }
//calculating the valid integers entered by the user
	        System.out.println("valid integers entered by the user are:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }
}
}
