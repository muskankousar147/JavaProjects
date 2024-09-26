package com.xworkz.exceptionhandling.runner;

import com.xworkz.exceptionhandling.ArrayOutOfBondException;

public class ArrayOutOfBondExceptionRunner {

	public static void main(String[] args) {
		try {
			String[] array = new String[2];
	        System.out.println(array[3]);
		}catch(Exception abc) {
			System.out.println("array out of bond exception:" +abc.getMessage());
		}
	}

}
