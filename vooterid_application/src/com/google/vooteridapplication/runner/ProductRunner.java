package com.google.vooteridapplication.runner;
import com.google.vooteridapplication.things.Product;
public class ProductRunner {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("powder");
		   if(product.getName()=="powder" && product.getName()=="powder"){
		   System.out.println("name:"+product.getName());
		   System.out.println("name is matching");
		   }else{
		   System.out.println("mis match");
		   }
		    //System.out.println("name:"+product.getname());
			
		   product.setPrice(230);
		   System.out.println("age:"+product.getPrice());
		   
		   product.setQuantity(500);
		   if(product.getQuantity()>500 && product.getQuantity()<1000){
		   System.out.println("quantity:"+product.getQuantity());
		   System.out.println("quantities are matching");
		   }else{
		   System.out.println("mis match");
		   }
		   
		   

		}
}




