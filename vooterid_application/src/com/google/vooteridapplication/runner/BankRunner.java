package com.google.vooteridapplication.runner;

import com.google.vooteridapplication.things.Bank;

public class BankRunner {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setname("muskan");
			   if(bank.getname()=="muskan" && bank.getname()=="muskan"){
			   System.out.println("name:"+bank.getname());
			   System.out.println("name is matching");
			   }else{
			   System.out.println("mis match");
			   }
			    //System.out.println("name:"+bank.getname());
				
			   bank.setbankName("sbi");
			   System.out.println("bank name is:"+bank.getbankName());
			   
			   bank.setnum(10);
			   if(bank.getnum()>10 && bank.getnum()<=10){
			   System.out.println("account number is:"+bank.getnum());
			   System.out.println("name and bank name details are matching");
			   }else{
			   System.out.println("mis match");
			   }
			   
	}

}
