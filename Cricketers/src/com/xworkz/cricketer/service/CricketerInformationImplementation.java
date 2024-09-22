package com.xworkz.cricketer.service;

import com.xworkz.cricketer.dto.CricketerInformationDto;
import com.xworkz.cricketer.repository.CricketerRepository;
import com.xworkz.cricketer.repository.CricketerRepositoryImplementation;

public class CricketerInformationImplementation implements CricketerInformation{
	CricketerRepository info = new CricketerRepositoryImplementation();

	@Override
	public boolean setarraysize(int arraysize) {
		if(arraysize > 0) {
			if(info.setarraysize(arraysize)) {
				System.out.println("array size is correct");
				return true;
			}
		}
		else {
			System.out.println("array size is not correct it should be greater than zero");
		}
		return false;
	}

	@Override
	public String validateAndSave(CricketerInformationDto listofdto) {
		System.out.println("save method is on");
		if(listofdto != null) {
			if(!info.checkDuplicate(listofdto)) {
				if(info.onSave(listofdto)) {
					System.out.println("saved successfully");
					return "saved";
				}
				
			}
			
		}
		return "not saved";
	}

	@Override
	public String update(String playerName, CricketerInformationDto dto) {
		if(info.update(playerName, dto)) {
			System.out.println("updated");
			return "updated";
			
		}
		return "not updated";
	}

	@Override
	public void read() {
		info.read();
		
	}

}
