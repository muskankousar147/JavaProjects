package com.xworkz.accessories2.runner;

import com.xworkz.accessories2.Dto.PersonDto;
import com.xworkz.accessories2.abstracts.Persons;

public class PersonDtoRunner {

	public static void main(String[] args) {
		 PersonDto details = new PersonDto(56.0,"afrid",true,'b',673572573l,5.2f,23459);
		 
		 Persons data = new Persons();
		 
		 details.Person();
		 details.Person1();
		 details.Person2();
		 
		 data.PersonA();
		 data.PersonB();
		 data.PersonC();
		 
		 
	}

}
