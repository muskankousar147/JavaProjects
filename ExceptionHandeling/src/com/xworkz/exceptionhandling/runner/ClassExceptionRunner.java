package com.xworkz.exceptionhandling.runner;

import com.xworkz.exceptionhandling.ClassException;

public class ClassExceptionRunner{

	public static void main(String[] args) {
		try{
			String abc = new Integer(100);
			 System.out.println((String) abc); 
		}catch (Exception message) {
            System.out.println(" class Exception found: " +message.getMessage());
        }
	}
}
