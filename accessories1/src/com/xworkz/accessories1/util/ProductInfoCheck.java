package com.xworkz.accessories1.util;

import com.xworkz.accessories1.dto.ProductDto;

public class ProductInfoCheck {
	public static boolean checkDuplicate(ProductDto[] productdto, ProductDto dto) {
	System.out.println("checkDuplicate");
	for(ProductDto name: productdto) {
		if(name!=null && name.equals(dto)) {
			System.out.println("duplicate checked");
			return true;
		}
	}
	System.out.println("duplicate");
	return false;
}


}
