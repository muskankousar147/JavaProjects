package com.xworkz.tea.service;

import com.xworkz.tea.abstracts.Powder;
import com.xworkz.tea.abstracts.PowderAbstract;
import com.xworkz.tea.dto.PowderDto;
import com.xworkz.tea.util.PowderInfoCheck;

public class PowderService {
	PowderAbstract validation = new Powder();
	private PowderDto[] teadto = new PowderDto[4];
	private int index = 0;
	
	public String Onsave(PowderDto dto) {
		System.out.println("saving method is running");
		if(validation.validateName(dto.getName()) 
				&& validation.validateCost(dto.getCost())
				&& validation.validateWeight(dto.getWeight())
				&& validation.validateLocation(dto.getLocation())){
			boolean duplicateresult = PowderInfoCheck.checkDuplicate(teadto, dto);
			if(duplicateresult == false) {
				System.out.println("coffee details are saved");
				if(this.index < teadto.length) {
					teadto[index] = dto;
					index++;
				}else {
					System.out.println("not saved");
				}
			}
		}
	return "saved";	
	
	}
}



