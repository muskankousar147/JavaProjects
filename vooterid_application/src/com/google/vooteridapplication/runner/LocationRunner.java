package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Location;
public class LocationRunner {

	public static void main(String[] args) {
		Location location  = new Location();
	System.out.println("country name:"+location.getCountryname());
	System.out.println("states:"+location.getstates());
	System.out.println("population:"+location.getpopulation());
	
	System.out.println("capital:"+location.getcapital());
	System.out.println("noOfHospitals:"+location.getnoOfHospitals());
	System.out.println("noOfHospitals:"+location.getnoOfSchools());
	System.out.println("noOfHighways:"+location.getnoOfHighways());
	System.out.println("country:"+location.toString());
	}
	}
