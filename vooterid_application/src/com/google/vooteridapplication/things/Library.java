package com.google.vooteridapplication.things;

public class Library {
	public int number;
	public String name;
	public String address;
	

	public Library(){
		System.out.println("no argument constructor");
	}

	public Library(int number){
	System.out.println("number :"+number);
	}
	public Library(int number, String name){
	System.out.println("name:"+number+ " "+name);
	}
	public Library(int number, String name, String address){
	System.out.println("address:"+number+ " " +name+ " "+address);
	}

	
	}

