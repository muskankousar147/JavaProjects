package com.xworkz.accessories1.runner;

import com.xworkz.accessories1.constant.Products;
import com.xworkz.accessories1.dto.ProductDto;
import com.xworkz.accessories1.service.ProductService;
import com.xworkz.accessories1.abstracts.Product;



public class ProductDtoRunner {

	public static void main(String[] args) {
//		ProductDto product = new ProductDto();
//		Products products = new Products();
//		
//		products.validateName("cotton");
//		products.validatePrice(50000);
//		products.validateRatings(5.5);
//		products.validateBrand("zara");

	}
	ProductService service = new ProductService();
	
	ProductDto productdto1 = new ProductDto("slippers", Products.KULSUM.toString(), 7000, 7.6);
	ProductDto productdto2 = new ProductDto("sare", Products.BIBA.toString(), 5600, 5.6);
	ProductDto productdto3 = new ProductDto("dress", Products.ZARA.toString(), 60000, 5.6);
	

	service.onSave(productdto1);
	service.onSave(productdto2);
	service.onSave(productdto3);
	
	
	service.read();
	
}

