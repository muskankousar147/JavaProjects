package com.xworkz.accessories1.abstracts;

public class Products extends Product {

	@Override
	public boolean validateName(String name) {
		if(name!=null && name.isEmpty()) {
			System.out.println("name is saved");
			return true;
		}
		else {
			System.out.println("not saved");
		}
		return false;
	}

	@Override
	public boolean validatePrice(int price) {
		if(price <= 50000) {
			System.out.println("price is saved");
			return true;
		}else {
			System.out.println("price is not saved");
		}
		return false;
	}

	@Override
	public boolean validateRatings(double ratings) {
		if(ratings >= 5.0) {
			System.out.println("ratings are saved");
			return true;
		}else {
			System.out.println("not saved");
		}
		return false;
	}

	@Override
	public boolean validateBrand(String location) {
		if(location != null && location.isEmpty()) {
			System.out.println("location is saved");
			return true;
		}
		System.out.println("not saved");
		return false;
	}
	

}
