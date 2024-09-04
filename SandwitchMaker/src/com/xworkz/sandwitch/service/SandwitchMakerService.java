package com.xworkz.sandwitch.service;

import com.xworkz.sandwitch.dto.SandWitchMakerDto;
import com.xworkz.sandwitch.util.SandwitchMakerInfoCheck;
import com.xworkz.sandwitch.dto.SandWitchMakerDto;
import com.xworkz.sandwitch.util.SandwitchMakerInfoCheck;

public class SandwitchMakerService {
	 private int index = 0;
	    private SandWitchMakerDto[] listofsandwitchmakerDetails;

	    public SandwitchMakerService(int arraySize) {
	        System.out.println("Initializing array size: " + arraySize);
	        this.listofsandwitchmakerDetails = new SandWitchMakerDto[arraySize];
	    }

	      
	    public int getarraylength() {
	        return listofsandwitchmakerDetails.length;
	    }
         
	    //save method
	    public String onSave(SandWitchMakerDto dto) {
	        if (dto != null && !SandwitchMakerInfoCheck.checkDuplicate(listofsandwitchmakerDetails, dto)) {
	            if (this.index < listofsandwitchmakerDetails.length) {
	                listofsandwitchmakerDetails[index] = dto;
	                index++;
	                return "Saved successfully";
	            } else {
	                return "Array is full, cannot save more product details.";
	            }
	        }
	        return "Not saved";
	    }

	    
	    //read operation
	    public void read() {
	    	for(SandWitchMakerDto dto:listofsandwitchmakerDetails) {
	    		System.out.println(dto);
	    	}
	   
	    }
	    
	    //search operation
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
	    public String delete(String sandwitchmaker){
			for(int i = 0; i < getarraylength(); i++){
			String[] array = null;
			if(array[index] == sandwitchmaker){
			array[index] = null;
			return "delete successfully";
			}
			}
			return "not deleted";
			}
	    
	    //update method
	    
	    public String update(String customerName,String newcustomerName){
			for(int i=0;i<getarraylength();i++){
			String[] arr = null;
			if(arr[index] == customerName){
			arr[index]=newcustomerName;
			System.out.println("upadated customer name is:"+newcustomerName);
			return "update successfully";
			}

			}
			return "not upadated";
			}
}
