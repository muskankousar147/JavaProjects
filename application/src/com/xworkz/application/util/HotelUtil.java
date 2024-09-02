package com.xworkz.application.util;

import com.xworkz.application.dto.HotelDto;

public class HotelUtil {
public static boolean checkDuplicates(HotelDto[] hotel,HotelDto dto) {
	System.out.println("duplicate check");
	for(HotelDto dto1:hotel) {
		if(hotel!=null && hotel.equals(dto));{
		return true;
	}
}
	
return false;
}
}
