package com.xworkz.tea.runner;


import com.xworkz.tea.dto.PowderDto;
import com.xworkz.tea.service.PowderService;
import com.xworkz.tea.abstracts.Powder;
import com.xworkz.tea.abstracts.PowderAbstract;

public class PowderRunner {

	public static void main(String[] args) {
		Powder details = new Powder();
		details.validateName("taj");
		details.validateCost(200);
		details.validateWeight(500.0);
		details.validateLocation("btm");
		
		 PowderDto powderDto = new PowderDto();
		 powderDto.setName("haselnut");
		 powderDto.setCost(500);
		 powderDto.setWeight(58);
		 powderDto.setLocation("hsr");
		 
		 
		 
		 
		
		PowderService service = new PowderService();
		service.Onsave(powderDto);
		
		
		
	}

}
