package com.google.vooteridapplication.things;

public class Car {

	         private String modelName;
			 private int rentPrice;
			 private int rating;
			 
			 public Car(){
			   System.out.println("no argument constructor");
			 }
			 
			 public Car(String modelName,int rentPrice,int rating){
			  this.modelName = modelName;
			  this.rentPrice = rentPrice;
			  this.rating = rating;
			  
			 }
			 
			 public void setModelName(String modelName){
			   this.modelName = modelName;
			 }
			 
			 public String getmodelName(){
			   return this.modelName;
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
	
	

