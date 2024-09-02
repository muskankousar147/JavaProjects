package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Job;
import com.google.vooteridapplication.things.JobDetail;
public class JobRunner {

	public static void main(String[] args) {
		Job job = new Job();
		job.info();
		JobDetail detail = new JobDetail();
		detail.display();

	}

}
