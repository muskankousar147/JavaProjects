package com.google.vooteridapplication.runner;

import com.google.vooteridapplication.things.AadharCard;

public class AadharCardRunner {

	public static void main(String[] args) {
		AadharCard aadharcard = new AadharCard();
		aadharcard.setname("muskan");
			   if(aadharcard.getname()=="muskan" && aadharcard.getname()=="muskan"){
			   System.out.println("name:"+aadharcard.getname());
			   System.out.println("name is matching");
			   }else{
			   System.out.println("mis match");
			   }
			    //System.out.println("name:"+aadharcard.getname());
				
			   aadharcard.setaddress("hsr");
			   System.out.println("address is:"+aadharcard.getaddress());
			   
			   aadharcard.setnum(10);
			   if(aadharcard.getnum()<10 && aadharcard.getnum()>10){
			   System.out.println("aadhar card number is:"+aadharcard.getnum());
			   System.out.println("aadhar card details are matching");
			   }else{
			   System.out.println("mis match");
			   }
			   

	}

}
