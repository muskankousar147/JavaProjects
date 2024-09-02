package com.xworkz.soap.runner;

import com.xworkz.soap.abstracts.Soap;
import com.xworkz.soap.abstracts.SoapAbstract;
import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.service.SoapService;

public class SoapRunner {

	public static void main(String[] args) {
		Soap details = new Soap();
		details.validateName("cinthol");
		details.validatePrice(250);
		details.validateRatings(7.0);
		details.validateBrand("godrej");
		
		 SoapDto soapDto = new SoapDto();
		 soapDto.setName("lux");
		 soapDto.setPrice(300);
		 soapDto.setBrand("nik");
		 soapDto.setRatings(5.0);
		 
		 
		 
		 
		
		SoapService service = new SoapService();
		service.Onsave(soapDto);
		
		

	}

}
