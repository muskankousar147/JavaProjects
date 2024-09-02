package com.xworkz.accessories.abstracts;

public class AbstractMuskan extends AbstractAccessories{

	@Override
	public boolean validateName(String name) {
		System.out.println("validateName ");
		if(name!=null &&name.isEmpty()) {
				System.out.println("name is  saved");
				return true;
			}
		System.out.println("name is not validateName ");
			return false;
	}

	@Override
	public boolean validateBrand(String brand) {
		System.out.println("validateBrand");
		if(brand!=null && brand.isEmpty()) {
				System.out.println("brand name is  saved");
				return true;
		}
		System.out.println("not validateBrand");
		return false;
		
	}

	@Override
	public boolean validatePrice(int price) {
		System.out.println("validatePrice");
		if(price>=5000) {
			 System.out.println("price is  saved");
			 return true;
		}
		System.out.println("not validatePrice");
		return false;
	}

	@Override
	public boolean validateRatings(double ratings) {
		System.out.println("validateRatings");
			if(ratings<=5.5) {
			System.out.println("ratings are  saved");	
			return true;
			}
			System.out.println("not validateRatings");
		return false;
	}

	
}
