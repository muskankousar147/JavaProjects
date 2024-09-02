package com.xworkz.coffee.abstracts;

public class Coffees extends CoffeeAbstract{

	@Override
	public boolean validateCost(int cost) {
		if(cost<=500) {
			System.out.println("purchase the flavoured coffee u need");
			return true;
		}else {
			System.out.println("no need");
		}
		return false;
	}

	@Override
	public boolean validateName(String name) {
		if(name!=null && name.isEmpty()) {
			System.out.println("name of the coffee is");
			return true;
		}else {
			System.out.println("no need");
		}
		return false;
	}

	@Override
	public boolean validateWeight(double weight) {
		if(weight>=500) {
			System.out.println("weight of the coffee in grams");
			return true;
		}else {
			System.out.println("wrong calculation");
		}
		return false;
	}

	@Override
	public boolean validateHelpCenter(long helpCenter) {
		
		if(helpCenter != 0 &&  validateHelpcenter(helpCenter)) {
			System.out.println("help center contact number contains 10 digits");
			return true;
		}else {
			System.out.println("invalid number entered");
		}
		return false;
	}

	@Override
	public boolean validateCondition(boolean condition) {
		if(condition!=true) {
			System.out.println("condition is true");
		
		return true;
	}else {
		System.out.println("not true");
		return false;
	}
	}

	@Override
	public boolean validateLocation(String location) {
		if(location!=null && location.isEmpty()) {
			System.out.println("location is correct");
		return true;
		}else {
			System.out.println("not correct");
			
		}
		return false;
	}

	public boolean validateHelpcenter(long helpcenter) {
		
			String valid = String.valueOf(helpcenter);
			if(valid.length() == 10) {
				return true;
	}
			return false;
}
}
