package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Flower;
import com.google.vooteridapplication.things.FlowerDetails;
public class FlowerDetailsRunner {

	public static void main(String[] args) {
		System.out.println("data of the flower are:");
		Flower flower = new Flower();
		flower.input();
		FlowerDetails flowerdetails = new FlowerDetails();
		flowerdetails.display();
		
	}

}
