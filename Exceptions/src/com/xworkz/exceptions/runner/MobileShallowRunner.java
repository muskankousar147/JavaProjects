package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.MobileShallow;

public class MobileShallowRunner {

	public static void main(String[] args) {
		MobileShallow mobile = new MobileShallow();
		mobile.name = "vivo";
		mobile.price = 29000;
		mobile.shopName = "super";
		mobile.ratings = 4.5;
		mobile.version = "y20";
		mobile.brand = "vivo";
		mobile.custName = "muskan";
		mobile.ownerName = "bismil";
		System.out.println(mobile);
		
		try {
			MobileShallow mob = mobile.clone();
			System.out.println("mobile details:" +mob);
			mob.name = "vivo";
			mob.price = 29000;
			mob.shopName = "super";
			mob.ratings = 4.5;
			mob.version = "y20";
			mob.brand = "vivo";
			mob.custName = "muskan";
			mob.ownerName = "bismil";
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		

	}

}
