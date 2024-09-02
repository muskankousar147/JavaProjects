package com.google.vooteridapplication.things;

public class Product{	
			 private String name;
			 private int price;
			 private int quantity;
			 
			 public Product() {
				 System.out.println("no argument");
			 }
			
			 public Product(String name,int price,int quantity){
			  this.name=name;
			  this.price=price;
			  this.quantity=quantity;
			  
			 }
			 
			 public void setName(String name){
			   this.name=name;
			 }
			 
			 public String getName(){
			   return this.name;
			 }
			 
			 public void setPrice(int price){
			   this.price=price;
			  }
			  
			  public int getPrice(){
			   return this.price;
			  }
			  public void setQuantity(int quantity){
			   this.quantity=quantity;
			   }
			   public int getQuantity(){
			    return this.quantity;
			  }
			 
			   
			   
			  

			   
			}




