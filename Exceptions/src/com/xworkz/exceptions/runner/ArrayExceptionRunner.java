package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.ArrayException;

public class ArrayExceptionRunner {

	public static void main(String[] args) throws ArrayException {
		 //try catch block
				try {
					String[] array = new String[2];
			        System.out.println(array[3]);
				}catch(Exception abc) {
					System.out.println("array out of bond exception:" +abc.getMessage());
					throw new ArrayException("array out of bound");
				}
			}
	}


