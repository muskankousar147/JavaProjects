package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Bus;
import com.google.vooteridapplication.things.BusData;
public class BusDataRunner {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.data();
		BusData busdata = new BusData();
		busdata.display();
	}

}
