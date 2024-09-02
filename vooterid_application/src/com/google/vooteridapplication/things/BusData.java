package com.google.vooteridapplication.things;
import com.google.vooteridapplication.things.Bus;

public class BusData {
	public String name;
	public String placeName;
	public int price;
	public String destination;
	
	public void display() {
		name = "suraj-travels";
		placeName = "dandeli";
		price = 5000;
		destination = "kashmir";
		
		System.out.println("package details are:"+name+ " "+placeName+ " "+price+ " "+destination);
	}
}
