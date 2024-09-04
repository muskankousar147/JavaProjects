package com.xworkz.coffeemaker.util;

import com.xworkz.coffeemaker.dto.CoffeeMakerDto;

public class CoffeeMakerInfoCheck {

	public static boolean checkDuplicate(CoffeeMakerDto[] listofcoffeemakerdetails, CoffeeMakerDto dto) {
		if(dto != null) {
			System.out.println("checking for duplicates");
			return true;
		}else {
			System.out.println("no found");
			
		}
		return false;
	}

}
