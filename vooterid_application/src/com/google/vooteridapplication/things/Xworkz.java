package com.google.vooteridapplication.things;

public class Xworkz {
private String name;
private String address;
 
public Xworkz() {
	System.out.println("no argument constructor");
}
public Xworkz(String name, String address) {
	this.name = name;
	this.address = address;
	
}
public void setname(String name) {
	this.name = name;
}
public String getname() {
	return this.name;
}
public void setaddress(String address) {
	this.address = address;
	
}
public String getaddress() {
	 return this.address;
}
}
