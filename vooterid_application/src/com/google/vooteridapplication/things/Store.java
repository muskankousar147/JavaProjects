package com.google.vooteridapplication.things;

public class Store {
	private String name;
	 private int stock;
	 private int price;
	 
	 public Store(){
	   System.out.println("no argument constructor");
	 }
	 
	 public Store(String name,int stock,int price){
	  this.name = name;
	  this.stock = stock;
	  this.price = price;
	  
	 }
	 
	 public void setname(String name){
	   this.name = name;
	 }
	 
	 public String getname(){
	   return this.name;
	 }
	 
	 public void setstock(int stock){
	   this.stock = stock;
	  }
	  
	  public int getstock(){
	   return this.stock;
	  }
	  public void setprice(int price){
	   this.price = price;
	   }
	   public int getprice(){
	    return this.price;
	  }
	     
	}



