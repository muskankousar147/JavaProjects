package com.xworkz.coffemaker.service;

import com.xworkz.coffeemaker.dto.CoffeeMakerDto;
import com.xworkz.coffeemaker.util.CoffeeMakerInfoCheck;


public class CoffeeMakerService {
	private int index = 0;
	private CoffeeMakerDto[] listofcoffeemakerdetails;
	
	public CoffeeMakerService(int arraySize) {
		System.out.println("array size is:" +arraySize);
		this.listofcoffeemakerdetails = new CoffeeMakerDto[arraySize];
		

	}
public int getarraylength() {
	return listofcoffeemakerdetails.length;
}

//save method
public String onSave(CoffeeMakerDto dto) {
	if (dto != null && !CoffeeMakerInfoCheck.checkDuplicate(listofcoffeemakerdetails, dto)) {
		if(this.index < listofcoffeemakerdetails.length) {
			this.listofcoffeemakerdetails[index] = dto;
			index++;
			 return "Saved successfully";
        } else {
            return "Array is full, cannot save more product details.";
        }
    }
    return "Not saved";

		
}
//update method
public String update(String brandName, String newbrandName) {
	for(int i = 0; i < getarraylength(); i++) {
		String[] arr = null;
		if(arr[index] == brandName) {
			arr[index] = newbrandName;
			System.out.println("updated brand name is:" +newbrandName);
			return "updated successfully";
		}
		return "not updated";
	}
	return newbrandName;
}

//search method

	 public String search(String sandwitchmaker){
			for(int i=0; i<getarraylength(); i++){
				String[] array = null;
				if(array [index] == sandwitchmaker){
					index++;
					return "searched";
				}
			}
			return "not searched";
			
		}
	//delete method
	    public String delete(String coffeemaker){
			for(int i = 0; i < getarraylength(); i++){
			String[] array = null;
			if(array[index] == coffeemaker){
			array[index] = null;
			return "delete successfully";
			}
			}
			return "not deleted";
			}

}
