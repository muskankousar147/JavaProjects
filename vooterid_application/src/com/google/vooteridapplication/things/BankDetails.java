package com.google.vooteridapplication.things;

public class BankDetails {
	private  String bankName;
    private String name;
    private int bank_balance;
    

	public BankDetails(String bankName,String name,int bank_balance){
	 this.bankName = bankName;
	 this.name = name;
	 this.bank_balance = bank_balance;
	 
	}
	public BankDetails() {
		System.out.println("no argument constructor");
	}

	public void setbankName(String bankName){
	  this.bankName = bankName;
	}

	public String getbankName(){
	  return this.bankName;
	}

	public void setname(String name){
	  this.name = name;
	 }
	 
	 public String getname(){
	  return this.name;
	 }
	 public void setbank_balance(int bank_balance){
	  this.bank_balance = bank_balance;
	  }
	  public int getbank_balance(){
	   return this.bank_balance;
	 }
}
