package com.google.vooteridapplication.things;

public class AadharCard {

	private String name;
	private String address;
	private int num;

	public AadharCard(){
	  System.out.println("no argument constructor");
	}

	public AadharCard(String name,String address,int num){
	 this.name = name;
	 this.address = address;
	 this.num = num;
	 
	}

	public void setname(String name){
	  this.name = name;
	}

	public String getname(){
	  return this.name;
	}

	public void setaddress(String address){
	  this.address = address;
	 }
	 
	 public String getaddress(){
	  return this.address;
	 }
	 public void setnum(int num){
	  this.num = num;
	  }
	  public int getnum(){
	   return this.num;
	 }
	    
}
