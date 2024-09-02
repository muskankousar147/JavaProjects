package com.google.vooteridapplication.things;

public class Bank {
private String name;
private String bankName;;
private int num;

public Bank(){
  System.out.println("no argument constructor");
}

public Bank(String name,String bankName,int num){
 this.name = name;
 this.bankName = bankName;
 this.num = num;
 
}

public void setname(String name){
  this.name = name;
}

public String getname(){
  return this.name;
}

public void setbankName(String bankName){
  this.bankName = bankName;
 }
 
 public String getbankName(){
  return this.bankName;
 }
 public void setnum(int num){
  this.num = num;
  }
  public int getnum(){
   return this.num;
 }
    
}



