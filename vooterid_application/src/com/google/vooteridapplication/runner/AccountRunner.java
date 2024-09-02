package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Account;
public class AccountRunner {

	public static void main(String[] args) {
		
			Account account = new Account("mahevish");
			System.out.println(account);

			Account account1 = new Account("mahevish", "savings");
			System.out.println(account1);

			Account account2 = new Account("mahevish", "savings", 2500);
			System.out.println(account2);



			}
		
	}

