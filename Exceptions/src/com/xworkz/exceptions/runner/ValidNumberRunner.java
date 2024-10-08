package com.xworkz.exceptions.runner;

import java.util.Scanner;

import com.xworkz.exceptions.NumberOutOfRangeException;

public class ValidNumberRunner {
public static void main(String[] args) throws NumberOutOfRangeException {
	//try finally
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 80: ");
    String input = scanner.nextLine();
    try {
        int number = Integer.parseInt(input);
        if (number < 1 || number > 80) {
            throw new NumberOutOfRangeException("Number must be between 1 and 80: " + number);
        }
        System.out.println("valid number: " + number);
    }
finally {
	scanner.close();
}
}
}

