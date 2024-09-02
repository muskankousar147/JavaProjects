package com.xworkz.accessories1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class ProductDto {
private String name;
private int price;
private double ratings;
private String brand;

@Override
public String toString() {
	return "ProductDto [name=" +getName() + ", price=" +getPrice() + ", ratings=" +getRatings() + ", brand= getBrand()]"; 
}

public ProductDto(String name2, String string, int ratings2, double d) {
	// TODO Auto-generated constructor stub
}

}
