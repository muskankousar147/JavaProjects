package com.google.vooteridapplication.things;

public class Hospital {
	
		 private String name;
		 private int age;;
		 private int status;
		 
		 
		 public Hospital(){
		   System.out.println("no argument constructor");
		 }
		 
		 public Hospital(String name,int age,int status){
		  this.name=name;
		  this.age=age;
		  this.status=status;
		  
		 }
		 
		 public void setname(String name){
		   this.name=name;
		 }
		 
		 public String getname(){
		   return this.name;
		 }
		 
		 public void setage(int age){
		   this.age=age;
		  }
		  
		  public int getage(){
		   return this.age;
		  }
		  public void setstatus(int status){
		   this.status=status;
		   }
		   public int getstatus(){
		    return this.status;
		  }
		 
		   
		   
		  

		   
		}


