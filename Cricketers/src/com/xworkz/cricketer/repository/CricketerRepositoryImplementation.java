package com.xworkz.cricketer.repository;

import com.xworkz.cricketer.dto.CricketerInformationDto;

public class CricketerRepositoryImplementation implements CricketerRepository{
private int index = 0;
private CricketerInformationDto listofDto[];

	@Override
	public boolean setarraysize(int arraysize) {
		listofDto = new CricketerInformationDto[arraysize];
		if(listofDto.length == arraysize) {
			System.out.println("array size is correct");
			return true;
		}
		
		return false;
	}
	@Override
	public boolean onSave(CricketerInformationDto listofdto) {
		if(listofDto != null) {
			if(this.index < listofDto.length) {
				listofDto[index] = listofdto;
				index++;
				System.out.println("saved successfully");
				return true;
				
			}
		}
		return false;
	}
	@Override
	public void read() {
		if(listofDto != null) {
			for(int i = 0; i < listofDto.length ; i++) {
				System.out.println(listofDto[i]);
			}
		}
		
	}
	@Override
	public boolean checkDuplicate(CricketerInformationDto listofdto) {
		if(listofDto != null) {
			for(int i = 0; i < listofDto.length; i++) {
				if(listofDto[i] != null && listofDto[i].equals(listofdto));
				return true;
				
			}
		}
		return false;
	}
	@Override
	public boolean update(String playerName, CricketerInformationDto dto) {
		if(listofDto != null) {
			for(int i = 0; i <listofDto.length; i++) {
				if(listofDto != null && listofDto[i] != null && listofDto[i].getPlayerName().equals(playerName)) {
					listofDto[i].setPlayerName(dto.getPlayerName());
					listofDto[i].setPlayerName(dto.getScore());
					return true;
				}
			}
		}
		return false;
	}

}
