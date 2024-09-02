package com.xworkz.soap.abstracts;

public abstract class SoapAbstract {
	
    public abstract boolean validateName(String name);
    public abstract boolean validatePrice(int price);
    public abstract boolean validateBrand(String brand); 
    public abstract boolean validateRatings(double ratings);
}
