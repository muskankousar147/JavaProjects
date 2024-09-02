package com.xworkz.application.service;

import com.xworkz.application.dto.HotelDto;
import com.xworkz.application.util.HotelUtil;

public class Hotel {

public HotelDto[] hotel= new HotelDto[3];

//String []a=new String[4];

private int index =0;

public void onsave(HotelDto dto) {
	if(dto!=null) {
		//return "not saved";
		this.hotel[index]=dto;
		
//		System.out.println("Hotel data saved :"+dto.getName());
		System.out.println(dto.toString());

		
		index++;
	}else {
		boolean duplicate = HotelUtil.checkDuplicates(hotel, dto);
		if(duplicate == false) {
			if(this.index<hotel.length) {
				hotel[index]=dto;
				index++;
			}
		}
		//return "not saved";
		//System.out.println("Dto is Null");
	}
}



}