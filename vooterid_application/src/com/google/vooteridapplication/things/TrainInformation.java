package com.google.vooteridapplication.things;
import com.google.vooteridapplication.things.Train;
public class TrainInformation {
	public String name;
	public double time;
	public String from;
	public String to;
	
	
	public void display() {
		name = "hampi-express";
		time = 23.00;
		from = "hospet";
		to = "bangalore";
		
		System.out.println("information aboit the train is:"+name+ " "+time+ " "+from+ " "+to);
	}
}
