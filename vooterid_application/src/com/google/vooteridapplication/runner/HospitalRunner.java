package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Hospital;
public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		     hospital.setname("muskan");
			   if(hospital.getname()=="muskan" && hospital.getname()=="muskan"){
			   System.out.println("name:"+hospital.getname());
			   System.out.println("name is matching");
			   }else{
			   System.out.println("mis match");
			   }
			    //System.out.println("name:"+hospital.getname());
				
			   hospital.setage(23);
			   System.out.println("age:"+hospital.getage());
			   
			   hospital.setstatus(5);
			   if(hospital.getstatus()>10 && hospital.getstatus()<10){
			   System.out.println("noofPost:"+hospital.getstatus());
			   System.out.println("no of post are matching");
			   }else{
			   System.out.println("mis match");
			   }
			   
			   

			}
	}


