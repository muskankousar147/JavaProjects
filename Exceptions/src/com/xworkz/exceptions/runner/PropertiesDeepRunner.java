package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.PropertiesDeep;

public class PropertiesDeepRunner {

	public static void main(String[] args) {
		PropertiesDeep prop = new PropertiesDeep();
		prop.getName();
		prop.getCost();
		System.out.println(prop);
		
		try {
			PropertiesDeep pro = prop.Clone();
			pro.setName("tv");
			pro.setCost(12000);
			System.out.println("properties of the phone is:" +pro);
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
