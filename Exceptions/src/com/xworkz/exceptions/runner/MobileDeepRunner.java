package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.MobileDeep;

public class MobileDeepRunner {

	public static void main(String[] args) {
		MobileDeep mob = new MobileDeep();
		mob.getCustName();
		mob.getName();
		mob.getBrand();
		mob.getShopName();
		mob.getPrice();
		mob.getOwnerName();
		mob.getVersion();
		mob.getRatings();
		
		System.out.println(mob);
		try {
			MobileDeep mobs =mob.clone();
			mobs.setCustName("kousar");
			mobs.setName("redme");
			mobs.setBrand("android");
			mobs.setShopName("bismillah");
			mobs.setPrice(23440);
			mobs.setOwnerName("varun");
			mobs.setOwnerName("shashi");
			mobs.setVersion("y21");
			mobs.setRatings(4.5);
			System.out.println("mobile details are:" +mobs);;
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		

	}

}
