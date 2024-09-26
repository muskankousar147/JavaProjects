package com.xworkz.exceptionhandling.runner;

public class NullPointerExceptionRunner {

	public static void main(String[] args) {
		String name = "muskan";
		try {
			if(name != null) {
			int length = name.length();
     	System.out.println("length should not to be null it should maintain some values: "+length);
			}
		}catch(NullPointerException message) {
			throw new NullPointerException("name cannot be null:" +message.getMessage());
		}

		}

	}
	
