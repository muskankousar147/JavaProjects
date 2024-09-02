package com.google.vooteridapplication.things;
import com.google.vooteridapplication.things.Job;

public class JobDetail extends Job {
//	public String compName;
//	public int age;
//	public String location;
//	public float salary;
	public int mobNumber;
	public String description;
	
	public void display() {
		compName = "hcl";
		age = 23;
		location = "btm-layout";
		salary = 2.3f;
		mobNumber = 53624567;
		description = "tester";
		
		System.out.println("job description:"+compName+" "+age+" "+location+" "+salary+" "+salary+" "+mobNumber+" "+description);
	}
}
