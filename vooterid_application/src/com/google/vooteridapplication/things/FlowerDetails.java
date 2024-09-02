package com.google.vooteridapplication.things;
import com.google.vooteridapplication.things.Flower;
public class FlowerDetails extends Flower{
	public String name;
	public int noOfFlower;
	public String shopName;
	public String shopLocation;

	public String type;
	public int rupees;
	
	public void display() {
		name = "mogra";
		noOfFlower = 23;
		shopName = "show-cafe";
		shopLocation = "btm-layout";
		type = "white";
		rupees = 230;
		System.out.println("print the details:"+name+ " " +noOfFlower+ " " +shopName+ " " +type+ " " +rupees);
	}
}
