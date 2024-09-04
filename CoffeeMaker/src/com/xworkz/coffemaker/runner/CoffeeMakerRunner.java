package com.xworkz.coffemaker.runner;

import java.util.Scanner;

import com.xworkz.coffeemaker.dto.CoffeeMakerDto;
import com.xworkz.coffemaker.service.CoffeeMakerService;

public class CoffeeMakerRunner {
Scanner scanner = new Scanner(System.in);public CoffeeMakerRunner() {
	System.out.println("enter the cooffee maker size to store:");
	int arraySize = scanner.nextInt();
	scanner.nextLine();
	 System.out.println("the entered array size:"+arraySize);
	CoffeeMakerService coffeemaker = new CoffeeMakerService(arraySize);
	System.out.println("enter the coffee maker size:" +coffeemaker.getarraylength());
	
	
	CoffeeMakerDto coffee = new CoffeeMakerDto();
	System.out.println("1. save method");
	System.out.println("enter your choice");
	int data = scanner.nextInt();
	
	System.out.println("2. update method");
	System.out.println("enter your choice");
	int details = scanner.nextInt();
	
	System.out.println("3. search method");
	System.out.println("enter your choice");
	int detail = scanner.nextInt();
	
	System.out.println("4. delete method");
	System.out.println("enter your choice");
	int test = scanner.nextInt();
	
	
	
	System.out.println("the length of the array:");
	System.out.println("1. finding the length of the array opeartion");
	System.out.println("2. save operation");
	System.out.println("3. search operation");
	System.out.println("4. delete operation");
	int choice = scanner.nextInt();
	
	switch(choice) {
	case 1 : System.out.println("the length of the array is:"+coffeemaker.getarraylength());
	break;
	
	case 2 : System.out.println("save operation");
    System.out.println("instance counting");
    int instancecount = scanner.nextInt();
    if(instancecount<arraySize) {
    	for(int i = 0; i < instancecount; i++) {
    		CoffeeMakerDto sandwitch = new CoffeeMakerDto();
    		System.out.println("coffee maker brand name is:");
    		sandwitch.setBrandName(scanner.next());
    		System.out.println("updates coffee maker brand name is:");
    		sandwitch.setProductCode(scanner.nextInt());
    		break;
    		
    	}
    }
    
	case 3 : System.out.println("search operation");
    System.out.println("instance counting");
    int instancecounting = scanner.nextInt();
    if(instancecounting < arraySize) {
    	for(int i = 0; i < instancecounting; i++) {
    		CoffeeMakerDto sandwitch = new CoffeeMakerDto();
    		System.out.println("coffee maker brand name is:");
    		sandwitch.setBrandName(scanner.next());
    		System.out.println("search coffee maker brand name by product code:");
    		sandwitch.setProductCode(scanner.nextInt());
    		break;
    		
    	}
    }
    
	case 4 : System.out.println("delete operation");
    System.out.println("instance counting for delete operation");
    int instances = scanner.nextInt();
    if(instances < arraySize) {
    	for(int i = 0; i < instances; i++) {
    		CoffeeMakerDto sandwitch = new CoffeeMakerDto();
    		System.out.println("delete coffee maker brand name by product code:");
    		sandwitch.setProductCode(scanner.nextInt());
    		break;
    		
    	}
    }
    
    
    
    default : System.out.println("details of the product not correct");
	
	}
}


}
