package com.xworkz.accessories2.Dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PersonDto {

	    public double weight;
	    public String name;
	    public boolean correct;
	    public char bloodGroup;
	    public long number;
	    public float height;
	    public int houseNum;
	    
	    
	    
	    // Initialize properties using the constructor
	    public PersonDto(double weight, String name, boolean correct, char bloodGroup,
	                         long number, float height, int houseNum) {
	        this.weight = weight;
	        this.name = name;
	        this.correct = correct;
	        this.bloodGroup = bloodGroup;
	        this.number = number;
	        this.height = height;
	        this.houseNum = houseNum;
	        
	        System.out.println("persons details:"+weight+ " "+name+" "+correct+ " "+bloodGroup+ " "+number+ " "+height+ " "+houseNum);
	       
	    }
	 //3 instance methods
	    public void Person() {
	        System.out.println("Instance Method for person details");
	    }

	    public void Person1() {
	        System.out.println("Instance Method  for person 2 details");
	    }

	    public void Person2() {
	        System.out.println("Instance Method for person 3 details");
	    }

	    //3 static methods
	    public static void PersonA() {
	        System.out.println("Static Method for person a ");
	    }

	    public static void personB() {
	        System.out.println("Static Method for person b");
	    }

	    public static void personC() {
	        System.out.println("Static Method person c");
	    }

}
