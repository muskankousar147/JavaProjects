package com.google.vooteridapplication.things;

public class Course {
	    public int courseCode;
		public String name;
		public int credits;
		

		public Course(){
			System.out.println("no argument constructor");
		}

		public Course(int courseCode){
		System.out.println("course :"+courseCode);
		}
		public Course(int courseCode, String name){
		System.out.println("name of the course:"+courseCode+ " "+name);
		}
		public Course(int courseCode, String name, int credits){
		System.out.println("credits of the course:"+courseCode+ " " +name+ " "+credits);
		}

		
		}

