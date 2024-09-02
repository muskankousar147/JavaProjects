package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.VoterId;

public class VoterIdRunner {

	public static void main(String[] args) {
		VoterId voterid = new VoterId();
		
		voterid.setName("muskan");
		String name = voterid.getName();
		System.out.println("name is:"+name);

	}

}
