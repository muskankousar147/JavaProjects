package com.xworkz.shop.dto;
import java.util.Scanner;

public class Shop {
	public String name;
	public String address;
	public int price;
	public double gst;
	public boolean condition;
	public char block;
	public String shopName;
	public int profit;
	public double totalProfitGst;
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       Shop shop = new Shop();
        
        // Accept values from the user
        System.out.print("Enter user name: ");
        shop.name = scanner.nextLine();

        System.out.print("Enter the address of the shop: ");
        shop.address = scanner.nextLine();

        System.out.print("Enter the price of the shop rent: ");
        shop.price = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter gst as per the  shop's product : ");
        shop.gst = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter condition: ");
        shop.condition = scanner.nextBoolean();
        scanner.nextLine(); 
        
        System.out.print("Enter the block of the shop located: ");
        shop.block = scanner.nextLine().charAt(0);

        System.out.print("Enter the shop name): ");
        shop.shopName = scanner.nextLine();

        System.out.print("Enter the profit according to the product: ");
        shop.profit = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the total profit gst: ");
        shop.totalProfitGst = scanner.nextDouble();
        scanner.nextLine(); 
        scanner.close();

        //for verfication i kept this sop
        System.out.println("all the properties are working.");
    

	}

	}

