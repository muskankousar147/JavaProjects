package com.xworkz.coffee.service;

import com.xworkz.coffee.abstracts.CoffeeAbstract;
import com.xworkz.coffee.abstracts.Coffees;
import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.util.CoffeeInfoCheck;

public class CoffeeService{
	CoffeeAbstract validation = new Coffees();
	private CoffeeDto[] coffeedto = new CoffeeDto[4];
	private int index = 0;
	
	public String Onsave(CoffeeDto dto) {
		System.out.println("saving method is running");
		if(validation.validateCost(dto.getCost()) && validation.validateName(dto.getName()) && validation.validateWeight(dto.getWeight()) && validation.validateHelpCenter(dto.getHelpCenter())
				&& validation.validateCondition(dto.getCondition) && validation.validateLocation(dto.getLocation())){
			boolean duplicateresult = CoffeeInfoCheck.checkDuplicate(coffeedto, dto);
			if(duplicateresult == false) {
				System.out.println("coffee details are saved");
				if(this.index < coffeedto.length) {
					coffeedto[index] = dto;
					index++;
				}else {
					System.out.println("not saved");
				}
			}
		}
	return "saved";	
	
	}
}


