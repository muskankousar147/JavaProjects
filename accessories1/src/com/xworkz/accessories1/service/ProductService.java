package com.xworkz.accessories1.service;

import com.xworkz.accessories1.abstracts.Product;
import com.xworkz.accessories1.abstracts.Products;
import com.xworkz.accessories1.dto.ProductDto;
import com.xworkz.accessories1.util.ProductInfoCheck;

public class ProductService {
	Product validation = new Products();
	private ProductDto[] productdto = new ProductDto[4];
	private int index = 0;
	
	public String Onsave(ProductDto dto) {
		System.out.println("saving method is running");
		if(validation.validateName(dto.getName()) && validation.validatePrice(dto.getPrice()) && validation.validateRatings(dto.getRatings()) && validation.validateBrand(dto.getBrand())){
			boolean duplicateresult = ProductInfoCheck.checkDuplicate(productdto, dto);
			if(duplicateresult == false) {
				System.out.println("product details are saved");
				if(this.index < productdto.length) {
					productdto[index] = dto;
					index++;
				}else {
					System.out.println("not saved");
				}
			}
		}
	return "saved";	
	
	}
	
	public void read() {
		for (int i = 0; i < productdto.length; i++) {
			System.out.println(productdto[i]);
		}
	}

}
