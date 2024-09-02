package com.google.vooteridapplication.runner;

import com.google.vooteridapplication.things.Xworkz;

public class XworkzRunner {

	public static void main(String[] args) {
		Xworkz xworkz = new Xworkz();
		xworkz.setname("odc");
		
		System.out.println("name:"+xworkz.getname());
		
		
		
		xworkz.setaddress("marthahalli");
		
		System.out.println("address:"+xworkz.getaddress());
		
		
		
		/*
		   if(xworkz.getname()=="odc" && xworkz.getname()=="odc"){
		   System.out.println("name:"+xworkz.getname());
		   System.out.println("name is correct");
		   }else{
		   System.out.println("incorrect name");
		   }

		   xworkz.setaddress("marthahalli");
		   if(xworkz.getaddress()=="marthahalli" && xworkz.getaddress()=="marthahalli"){
		   System.out.println("address:"+xworkz.getaddress());
		   System.out.println("address is correct");
		   }else{
		   System.out.println("incorrect address");
		   }
		   */
	}

}
