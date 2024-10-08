package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.PropertiesShalow;

public class PropertiesShalowRunner {

	public static void main(String[] args) {
   PropertiesShalow properties = new PropertiesShalow();
   properties.name = "building";
   properties.price = 12000000;
   System.out.println("properties");
	
	
	try {
		PropertiesShalow pro = properties.clone();
		System.out.println("properties:" +pro);
		pro.name = "building";
		pro.price = 20000;
		
		System.out.println("property:" +pro);
		
	}catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}

}
}
