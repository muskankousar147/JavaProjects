package com.xworkz.sandwitch.runner;

import java.util.Scanner;
import com.xworkz.sandwitch.dto.SandWitchMakerDto;
import com.xworkz.sandwitch.service.SandwitchMakerService;

public class SandWitchMakerRunner {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of sandwitch details to store: ");
	        int arraySize = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.println("the entered array size:"+arraySize);
	        SandwitchMakerService sandwitchService = new SandwitchMakerService(arraySize);
	        System.out.println("the array length is:"+sandwitchService.getarraylength());
	        
	        SandWitchMakerDto sandwitchmaker = new SandWitchMakerDto();
	        System.out.println("1. save method");
	        System.out.println("enter your choice");
	        int choice = scanner.nextInt();
	        
	        System.out.println("2. read method");
	        System.out.println("enter your choice");
	        int test= scanner.nextInt();
	        
	        System.out.println("3. search method");
	        System.out.println("enter your choice");
	        int service = scanner.nextInt();
	        
	        System.out.println("4. delete method");
	        System.out.println("enter your choice");
	        int detail = scanner.nextInt();
	        
	        System.out.println("5. update method");
	        System.out.println("enter your choice");
	        int details = scanner.nextInt();
	        
	        
	        System.out.println("enter the choice");
	        System.out.println("1. toget the length of the array is:" +sandwitchService.getarraylength());
	        System.out.println("2. save operation:");
	        System.out.println("3. search operation:");
	        System.out.println("4. delete operation:");
	        System.out.println("5. update operation:");
	        int choices = scanner.nextInt();
	        
	        switch(choices) {
	        case 1 : System.out.println("the length of the array is:" +sandwitchService.getarraylength());
	        break;
	        
	        case 2 : System.out.println("save operation");
	        System.out.println("instance counting");
	        int instancecount = scanner.nextInt();
	        if(instancecount<arraySize) {
	        	for(int i = 0; i < instancecount; i++) {
	        		SandWitchMakerDto sandwitch = new SandWitchMakerDto();
	        		System.out.println("sandwitch  maker seller name is:");
	        		sandwitch.setShopName(scanner.next());
	        		System.out.println("sandwitch maker coustomer name is:");
	        		sandwitch.setCustomerName(scanner.next());
	        		break;
	        		
	        	}
	        }
	        case 3 : System.out.println("search operation");
	        System.out.println("instance counting");
	        	int countinstance = scanner.nextInt();
	        if(countinstance<arraySize) {
	        	for(int i = 0; i < countinstance; i++) {
	        		SandWitchMakerDto sandwitch = new SandWitchMakerDto();
	        		System.out.println("brand name is:");
	        		sandwitch.setBrandName(scanner.next());
	        		System.out.println("material used to make sandwitch maker is:");
	        		sandwitch.setMaterial(scanner.next());
	        		break;
	        }
	        }
	        
	        case 4 : System.out.println("delete operation");
	        System.out.println("instance counting");
        	int instancecounting = scanner.nextInt();
        if(instancecounting<arraySize) {
        	for(int i = 0; i < instancecounting; i++) {
        		SandWitchMakerDto sandwitch = new SandWitchMakerDto();
        		System.out.println("sandwitch  maker seller name is:");
        		sandwitch.setBrandName(scanner.next());
        		System.out.println("sandwitch maker coustomer name is:");
        		sandwitch.setMaterial(scanner.next());
        		break;
        }
	 
	}
	        case 5 : System.out.println("update operation");
	        System.out.println("instance counting");
        	int instances = scanner.nextInt();
        if(instances<arraySize) {
        	for(int i = 0; i < instances; i++) {
        		SandWitchMakerDto sandwitch = new SandWitchMakerDto();
        		System.out.println("sandwitch  maker old customer name is:");
        		sandwitch.setCustomerName(scanner.next());
        		System.out.println("sandwitch maker new coustomer name is:");
        		sandwitch.setCustomerName(scanner.next());
        		break;
        }
	 
	}
        default : System.out.println("correct details not entered");
        
    
        scanner.close();
	}       
	}
}


	

