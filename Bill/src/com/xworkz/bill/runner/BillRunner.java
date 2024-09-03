package com.xworkz.bill.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.bill.dto.BillDto;
import com.xworkz.bill.service.Bill;

public class BillRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bill details to store: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Bill billService = new Bill(arraySize);

        for (int i = 0; i < arraySize; i++) {
            BillDto bill = new BillDto();

            System.out.print("Enter the name: ");
            bill.setName(scanner.nextLine());

            System.out.print("Enter the bill type: ");
            bill.setBillType(scanner.nextLine());

            System.out.print("Enter the amount: ");
            bill.setAmount(scanner.nextInt());

            System.out.print("Enter the GST type: ");
            scanner.nextLine(); // Consume newline
            bill.setGstType(scanner.nextLine());

            System.out.print("Enter the GST percentage: ");
            bill.setGstPercentage(scanner.nextDouble());

            bill.setDateTime(LocalDateTime.now());
            bill.setPayDate(LocalDate.now());
            bill.setBillGenerated(true);

            String result = billService.onSave(bill);
            System.out.println(result);
        }

        scanner.close();
    }
}