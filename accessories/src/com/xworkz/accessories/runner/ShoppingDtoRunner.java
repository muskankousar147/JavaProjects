package com.xworkz.accessories.runner;

import com.xworkz.accessories.abstracts.AbstractMuskan;
import com.xworkz.accessories.constant.Brands;
import com.xworkz.accessories.dto.ShoppingDto;
import com.xworkz.accessories.service.ShoppingService;
public class ShoppingDtoRunner {
public static void main(String[] args) {
//	ShoppingDto shoppingdto = new ShoppingDto();
//	AbstractMuskan muskan = new AbstractMuskan();
//	muskan.name("muskan");
//	muskan.brand("zara");
//	muskan.price(2300);
//	muskan.ratings(6.7);
	
	ShoppingService service = new ShoppingService();
	ShoppingDto shoppingdto1 = new ShoppingDto("slippers", Brands.SKYPE.toString(), 7000, 7.6);
	ShoppingDto shoppingdto2 = new ShoppingDto("sare", Brands.BIBA.toString(), 5600, 5.6);
	ShoppingDto shoppingdto3 = new ShoppingDto("dress", Brands.TRENDS.toString(), 60000, 5.6);
	
//	service.onSave(shoppingdto);
	service.onSave(shoppingdto1);
	service.onSave(shoppingdto2);
	service.onSave(shoppingdto3);
	
	
	service.read();
	
}
}
