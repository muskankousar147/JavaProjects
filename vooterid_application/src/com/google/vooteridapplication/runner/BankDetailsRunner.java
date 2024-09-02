package com.google.vooteridapplication.runner;

import com.google.vooteridapplication.things.BankDetails;

public class BankDetailsRunner {

	public static void main(String[] args) {
		BankDetails bankdetails = new BankDetails();
		bankdetails.setbankName("yes-bank");
			   if(bankdetails.getbankName()=="yes-bank" && bankdetails.getbankName()=="yes-bank"){
			   System.out.println("name:"+bankdetails.getbankName());
			   System.out.println("name is matching");
			   }else{
			   System.out.println("mis match");
			   }
			    //System.out.println("name:"+bankdetails.getbankName());
				
			   bankdetails.setname("muskan");
			   System.out.println("address is:"+bankdetails.getname());
			   
			   bankdetails.setbank_balance(500);
			 
			   if(bankdetails.getbank_balance()<500 && bankdetails.getbank_balance()>1000){
			   System.out.println("please maintain bank balance:"+bankdetails.getbank_balance());
			   System.out.println("Bank balance details are matching");
			   }else{
			   System.out.println("mis match");
			   }
	
			   if(bankdetails.getbank_balance()<10000 && bankdetails.getbank_balance()>50000){
				   System.out.println("please maintain bank balance:"+bankdetails.getbank_balance());
				   System.out.println("bank balance details are matching");
				   }else{
				   System.out.println("mis match");
				   }
			   //withdraw amount from bank bank balance
			   if(bankdetails.getbank_balance()==10000 && bankdetails.getbank_balance()>50000){
				   System.out.println("account details is low you cant withdraw:"+bankdetails.getbank_balance());
				   System.out.println("bank balance details are");
				   }else{
				   System.out.println("remaining balance");
				   }
		
	
	
	
	
	}
	

}
