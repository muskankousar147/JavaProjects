package com.xworkz.cricketer.service;

import com.xworkz.cricketer.dto.CricketerInformationDto;

public interface CricketerInformation {
	boolean setarraysize(int arraysize);
String validateAndSave(CricketerInformationDto listofdto);
String update(String playerName, CricketerInformationDto dto);
void read();
}
