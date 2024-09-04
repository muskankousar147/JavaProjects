package com.xworkz.sandwitch.util;

import com.xworkz.sandwitch.dto.SandWitchMakerDto;

public class SandwitchMakerInfoCheck {

	public static boolean checkDuplicate(SandWitchMakerDto[] listofsandwitchmakerDetails, SandWitchMakerDto dto) {
		if(dto != null) {
			System.out.println("checking duplicates");
			return true;
		}else {
			System.out.println("do not cantain duplicate");
		}
		
		return false;
	}

}
