package com.xworkz.soap.service;

import com.xworkz.soap.abstracts.SoapAbstract;
import com.xworkz.soap.abstracts.Soap;
import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.util.SoapInfoCheck;

public class SoapService {
	SoapAbstract validation = new Soap();
	private SoapDto[] soapdto = new SoapDto[4];
	private int index = 0;
	
	public boolean Onsave(SoapDto dto) {
		System.out.println("saving method is running");
		if(validation.validateName(dto.getName())&& validation.validatePrice(dto.getPrice())
				&& validation.validateBrand(dto.getBrand()) 
				&& validation.validateRatings(dto.getRatings())){
			boolean duplicateresult = SoapInfoCheck.checkDuplicate(soapdto, dto);
			if(duplicateresult == false) {
				System.out.println("soap details are saved");
				if(this.index < soapdto.length) {
					soapdto[index] = dto;
					index++;
				}else {
					System.out.println("not saved");
				}
			}
		}
		return false;
	}
}
		
