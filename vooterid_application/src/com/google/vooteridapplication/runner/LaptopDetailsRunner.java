package com.google.vooteridapplication.runner;

import com.google.vooteridapplication.things.Laptop;
import com.google.vooteridapplication.things.LaptopDetails;
public class LaptopDetailsRunner {

	public static void main(String[] args) {
		Laptop laptopdetails  = new Laptop();
		System.out.println("laptop name:"+laptopdetails.getLaptopname());
		System.out.println("generation:"+laptopdetails.getgeneration());
		System.out.println("cost:"+laptopdetails.getcost());
		
		System.out.println("shop name:"+laptopdetails.getshopName());
		System.out.println("location:"+laptopdetails.getlocation());
		System.out.println("number:"+laptopdetails.getnum());
		System.out.println("noOfHighways:"+laptopdetails.getusers());
		System.out.println("ratings:"+laptopdetails.getratings());
		
		System.out.println("country:"+laptopdetails.toString());
		}

	}


