package com.google.vooteridapplication.runner;

import com.google.vooteridapplication.things.Store;

public class StoreRunner {

	public static void main(String[] args) {
		Store store = new Store();
		store.setname("muskan");
			   if(store.getname()=="muskan" && store.getname()=="muskan"){
			   System.out.println("name:"+store.getname());
			   System.out.println("name is matching");
			   }else{
			   System.out.println("mis match");
			   }
			    //System.out.println("name:"+store.getname());
				
			   store.setstock(300);
			   System.out.println("id:"+store.getstock());
			   
			   store.setprice(100);
			   if(store.getprice()>200 && store.getprice()<500){
			   System.out.println("price:"+store.getprice());
			   System.out.println("price details are matching");
			   }else{
			   System.out.println("mis match");
			   }
			   
			   
			  }

			

	}


