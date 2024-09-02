package com.xworkz.tea.abstracts;

public class Powder extends PowderAbstract {

	@Override
	public boolean validateName(String name) {
		if(name != null && name.isEmpty()) {
			System.out.println("name of the tea brand is");
			return true;
			
		}else {
			System.out.println("tea brand not found");
		}
		return false;
	
	}

	@Override
	public boolean validateCost(int cost) {
			if(cost <= 1000) {
				System.out.println("cost of the tea brand is");
				return true;
			}else {
				System.out.println("incorrect");
			}
			return false;
		}
	

	@Override
	public boolean validateWeight(double weight) {
		if(weight == 5) {
			System.out.println("weight according to the tea brand");
			return true;
		}else {
			System.out.println("incorrect");
		}
		return false;
	}

	

	@Override
	public boolean validateLocation(String location) {
		
			if(location != null && location.isEmpty()) {
				System.out.println("location of the factory is");
				return true;
			}else {
				System.out.println("incorrect");
			}
			return false;
	}

}
