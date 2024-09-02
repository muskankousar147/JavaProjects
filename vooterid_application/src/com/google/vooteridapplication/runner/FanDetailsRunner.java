package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Fan;
import com.google.vooteridapplication.things.FanDetails;

public class FanDetailsRunner {

	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.details();
		FanDetails fandetails = new FanDetails();
		fandetails.display();

	}

}
