package com.google.vooteridapplication.things;

public class Employee {
         private String name;
		 private int Id;;
		 private int salary;
		 
		 public Employee(){
		   System.out.println("no argument constructor");
		 }
		 
		 public Employee(String name,int Id,int salary){
		  this.name = name;
		  this.Id = Id;
		  this.salary = salary;
		  
		 }
		 
		 public void setname(String name){
		   this.name = name;
		 }
		 
		 public String getname(){
		   return this.name;
		 }
		 
		 public void setId(int Id){
		   this.Id = Id;
		  }
		  
		  public int getId(){
		   return this.Id;
		  }
		  public void setsalary(int salary){
		   this.salary = salary;
		   }
		   public int getsalary(){
		    return this.salary;
		  }
		     
		}
