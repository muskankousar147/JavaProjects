package com.xworkz.soap.abstracts;

public class Soap extends SoapAbstract {

	@Override
	public boolean validateName(String name) {
		if(name!=null && name.isEmpty()) {
			System.out.println("name of the soap is");
			return true;
		}else {
			System.out.println("no need");
		}
		return false;
	}

	@Override
	public boolean validatePrice(int price) {
		if(price<=500) {
			System.out.println("purchase soap cost u need");
			return true;
		}else {
			System.out.println("no need");
		}
		return false;
	}

	@Override
	public boolean validateBrand(String brand) {
		if(brand!=null && brand.isEmpty()) {
			System.out.println("brand of the soap is");
			return true;
		}else {
			System.out.println("no need");
		}
		return false;
	}

	@Override
	public boolean validateRatings(double ratings) {
		if(ratings<=8) {
			System.out.println("ratings is good");
		}else {
			System.out.println("not correct");
		}
		return false;
	}

}
