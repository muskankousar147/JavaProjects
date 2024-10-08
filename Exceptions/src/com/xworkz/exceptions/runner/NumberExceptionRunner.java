package com.xworkz.exceptions.runner;

import java.util.Scanner;

import com.xworkz.exceptions.NumberException;

public class NumberExceptionRunner {

	public static void main(String[] args) throws NumberException{
		//try catch finally
		Scanner scanner = new Scanner(System.in);
		NumberException number = new NumberException();

        System.out.print("Enter a number between 1 and 100: ");
        int inputNumber = scanner.nextInt();

        try {
            number.processNumber(inputNumber);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
	}


