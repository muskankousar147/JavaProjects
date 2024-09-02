package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Course;
public class CourseRunner {

	public static void main(String[] args) {
		
		      Course course = new Course();
			    System.out.println(course);

			   Course course1 = new Course(23);
					System.out.println(course1);

			   Course course2 = new Course(23, "summer");
					System.out.println(course2);

					Course course3 = new Course(23, "summer", 5);
					System.out.println(course3);

			}

	}


