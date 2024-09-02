package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Car;
public class CarRunner {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModelName("ferari");
		   if(car.getmodelName()=="ferari" && car.getmodelName()=="ferari"){
		   System.out.println("name:"+car.getmodelName());
		   System.out.println("name is matching");
		   }else{
		   System.out.println("mis match");
		   }
		    //System.out.println("name:"+car.getmodelName());
			
		   car.setrentPrice(123543);
		   System.out.println("price:"+car.getrentPrice());
		   
		   car.setrating(9);
		   if(car.getrating()>10 && car.getrating()<20){
		   System.out.println("car:"+car.getrating());
		   System.out.println("car details are matching");
		   }else{
		   System.out.println("mis match");
		   }
		   
		   
		  }

		

	}

