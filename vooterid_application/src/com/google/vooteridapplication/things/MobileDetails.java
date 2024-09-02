package com.google.vooteridapplication.things;

public class MobileDetails extends Mobile{
	public String name;
	public int num;
	public String sim;
	public String version;

	public void display(){
		 name = "muskan";
		 num = 342543567;
		 sim = "jio";
		 version = "y20";
		 
		 System.out.println("print the details:"+name+ " "+num+ " "+sim+" "+version);
		
	}
}
