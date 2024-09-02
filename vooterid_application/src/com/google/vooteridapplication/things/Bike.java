package com.google.vooteridapplication.things;

public class Bike {
	 private String name;
	 private int rentPrice;
	 private int rating;
	 
	 public Bike (){
	   System.out.println("no argument constructor");
	 }
	 
	 public Bike (String name,int rentPrice,int rating){
	  this.name = name;
	  this.rentPrice = rentPrice;
	  this.rating = rating;
	  
	 }
	 
	 public void setname(String name){
	   this.name = name;
	 }
	 
	 public String getname(){
	   return this.name;
	 }
	 
	 public void setrentPrice(int rentPrice){
	   this.rentPrice = rentPrice;
	  }
	  
	  public int getrentPrice(){
	   return this.rentPrice;
	  }
	  public void setrating(int rating){
	   this.rating = rating;
	   }
	   public int getrating(){
	    return this.rating;
	  }
	     
	
}
