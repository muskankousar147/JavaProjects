package com.xworkz.cricketer.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.cricketer.dto.CricketerInformationDto;
import com.xworkz.cricketer.service.CricketerInformation;
import com.xworkz.cricketer.service.CricketerInformationImplementation;

public class CricketerInformationRunner {

	public static void main(String[] args) {
		CricketerInformationDto cricketer = new CricketerInformationDto();
		cricketer.setPlayerName("virat");
		cricketer.setNoOfPlayers(11);
		cricketer.setPlayGroundLocation("rajiv nager");
		cricketer.setScore("s123");
		cricketer.setMatchTiming(LocalDateTime.now());
		
		CricketerInformationDto cricketerInfo = new CricketerInformationDto();
		cricketerInfo.setPlayerName("virat");
		cricketerInfo.setNoOfPlayers(11);
		cricketerInfo.setPlayGroundLocation("rajiv nager");
		cricketerInfo.setScore("s123");
		cricketerInfo.setMatchTiming(LocalDateTime.now());
		
		
		System.out.println("enter the array size");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		CricketerInformation cricket = new CricketerInformationImplementation();
		cricket.setarraysize(value);
		
		System.out.println("on save start");
		String result = cricket.validateAndSave(cricketer);
		String results = cricket.validateAndSave(cricketerInfo);
		
		System.out.println("result:"+result);
		System.out.println("results:"+results);
		
		cricket.validateAndSave(cricketer);
		cricket.read();
		cricket.update("kumar", cricketer);
		cricket.read();
		
		
		
		
		
		

	}

}
