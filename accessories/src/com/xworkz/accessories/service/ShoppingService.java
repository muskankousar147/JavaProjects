package com.xworkz.accessories.service;

import java.util.Arrays;

import com.xworkz.accessories.abstracts.AbstractMuskan;
import com.xworkz.accessories.dto.ShoppingDto;
import com.xworkz.accessories.util.ShoppingInfoCheck;

public class ShoppingService {
	AbstractMuskan validation = new AbstractMuskan();
	private ShoppingDto[] shoppingdto = new ShoppingDto[4];
	private int index = 0;

public String onSave(ShoppingDto dto) {
//	
//	if(validation.validateName(dto.getName())&&
//			validation.validateBrand(dto.getBrand())&&
//			validation.validatePrice(dto.getPrice())&&
//			validation.validateRatings(dto.getRatings())) {
//		System.out.println("saving method is running");
//		if(ShoppingInfoCheck.checkDuplicate(shoppingdto, dto)) {
			if(this.index < shoppingdto.length) {
				shoppingdto[index] = dto;
				index++;
				System.out.println("shopping details are saved");
			}
//			else {
//				System.out.println("length check if");
//			}
//		}else {
//			System.out.println("Duplicate check if ");
//		}
//	}else {
//		System.out.println("not saved if");
//}
return"saved";
}

public void read() {
	for(int i = 0; i <shoppingdto.length; i++) {
		System.out.println(shoppingdto[i]);
	}
		
	}
}
