package com.xworkz.coffee.runner;

import com.xworkz.coffee.abstracts.Coffees;
import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.service.CoffeeService;

public class CoffeDtoRunner {

	public static void main(String[] args) {
		Coffees details = new Coffees();
		details.validateCost(500);
		details.validateCondition(true);
		details.validateName("cold");
		details.validateHelpCenter(1234567890l);
		details.validateWeight(500.0);
		details.validateLocation("btm");
		
		 CoffeeDto coffeeDto = new CoffeeDto();
		 coffeeDto.setCost(67);
		 
		
		CoffeeService service = new CoffeeService();
		service.Onsave(coffeeDto);
		
			
		
	}

}
