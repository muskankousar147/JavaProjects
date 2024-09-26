package com.xworkz.exceptionhandling.runner;

import com.xworkz.exceptionhandling.ArrayLengthException;

public class ArrayLengthExceptionRunner {
  
	public static void main(String[] args){
		int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println("output: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException message) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + message.getMessage());
        }

}
}
