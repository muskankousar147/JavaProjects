package com.xworkz.exceptions.runner;

import java.util.Scanner;

import com.xworkz.exceptions.NumberOutOfRangeException;

public class NumbersCheckingRunner {
public static void main(String[] args) {
	//try catch catch exception
	
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 100: ");
    String input = scanner.nextLine();
    try {
        int number = Integer.parseInt(input);
        if (number < 1 || number > 20) {
            throw new NumberOutOfRangeException("Number must be between 1 and 20: " + number);
        }
        System.out.println("valid number: " + number);

    } catch (NumberFormatException e) {
        System.out.println("Exception caught: Please enter a valid integer.");
    } catch (NumberOutOfRangeException e) {
        System.out.println("Exception caught: " + e.getMessage());
}
}
}