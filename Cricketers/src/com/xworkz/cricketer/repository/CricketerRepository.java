package com.xworkz.cricketer.repository;

import com.xworkz.cricketer.dto.CricketerInformationDto;

public interface CricketerRepository {
boolean setarraysize(int arraysize);
boolean onSave(CricketerInformationDto listofdto);
void read();
boolean checkDuplicate(CricketerInformationDto listofdto);
boolean update(String playerName,CricketerInformationDto dto);
}
