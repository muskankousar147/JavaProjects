package com.google.vooteridapplication.runner;

import com.google.vooteridapplication.things.Student;

public class StudentRunner {

	public static void main(String[] args) {


		Student student = new Student();
		
		student.setName("muskan");
		String name = student.getName();
		System.out.println("name is:"+name);

	
		student.setGrade(23);
		int grade = student.getGrade();
		System.out.println("grade is:"+grade);

	}

}
