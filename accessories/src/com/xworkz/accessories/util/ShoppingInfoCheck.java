package com.xworkz.accessories.util;

import com.xworkz.accessories.dto.ShoppingDto;

public class ShoppingInfoCheck {

	public static boolean checkDuplicate(ShoppingDto[] shoppingdto, ShoppingDto dto) {
		System.out.println("checkDuplicate");
		for(ShoppingDto name: shoppingdto) {
			if(name!=null && name.equals(dto)) {
				System.out.println("duplicate checked");
				return true;
			}
		}
		System.out.println("duplicate");
		return false;
	}

}
