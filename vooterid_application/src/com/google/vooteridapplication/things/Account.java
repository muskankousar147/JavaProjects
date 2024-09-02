package com.google.vooteridapplication.things;

public class Account {
public String name;
public String type;
public String bankName;

public Account(){
System.out.println("details of the account");
}
public Account(String name){
System.out.println("name of the account:"+name);
}
public Account(String name, String type){
System.out.println("name of the account:"+name+ " "+type);
}
public Account(String name, String type, int price){
System.out.println("name of the account:"+name+ " "+type+ " "+price);
}
}




