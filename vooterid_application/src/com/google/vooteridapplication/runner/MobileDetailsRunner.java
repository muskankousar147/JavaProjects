package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Mobile;
import com.google.vooteridapplication.things.MobileDetails;
public class MobileDetailsRunner {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.input();
		MobileDetails mobiledetails =new MobileDetails();
		mobiledetails.display();
		
	}

}
