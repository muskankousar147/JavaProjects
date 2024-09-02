package com.xworkz.application.runner;

import com.xworkz.application.constant.HotelName;
import com.xworkz.application.dto.HotelDto;
import com.xworkz.application.service.Hotel;

public class HotelDtoRunner {

	public static void main(String[] args) {
//	Hotel hotel = new Hotel(Hotel.name,Hotel.ratings,Hotel.location,Hotel.noOfStaffs,Hotel.placeName);
		
		HotelDto dto=new HotelDto();
		dto.setName(HotelName.ALBAIK);
		dto.setRatings(4);
		dto.setLocation("Bengaluru");
		dto.setNoOfStaffs(10);
		dto.setPlaceName("BTM");
		
		HotelDto dto1=new HotelDto();
		dto1.setName(HotelName.DARBAR);
		dto1.setRatings(4);
		dto1.setLocation("Bengaluru");
		dto1.setNoOfStaffs(10);
		dto1.setPlaceName("BTM");

		HotelDto dto2=new HotelDto();
		dto2.setName(HotelName.FIVESTAR);
		dto2.setRatings(4);
		dto2.setLocation("Bengaluru");
		dto2.setNoOfStaffs(10);
		dto2.setPlaceName("BTM");
	
		Hotel h=new Hotel();
		h.onsave(dto);
		h.onsave(dto1);
		h.onsave(dto2);
		
		//System.out.println(h.onsave(dto));
		
		
	}

}
