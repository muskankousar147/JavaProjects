package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Bike;
public class BikeRunner {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setname("yamaha");
		   if(bike.getname()=="yamaha" && bike.getname()=="yamha"){
		   System.out.println("name:"+bike.getname());
		   System.out.println("name is matching");
		   }else{
		   System.out.println("mis match");
		   }
		    //System.out.println("name:"+bike.getmodelName());
			
		   bike.setrentPrice(230);
		   System.out.println("price:"+bike.getrentPrice());
		   
		   bike.setrating(9);
		   if(bike.getrating()>10 && bike.getrating()<20){
		   System.out.println("bike:"+bike.getrating());
		   System.out.println("bike details are matching");
		   }else{
		   System.out.println("mis match");
		   }
		   
		   
		  }
	}
