package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Train;
import com.google.vooteridapplication.things.TrainInformation;
public class TrainInformationRunner {

	public static void main(String[] args) {
		Train train = new Train();
		train.input();
		TrainInformation traininformation = new TrainInformation();
		traininformation.display();
	}

}
