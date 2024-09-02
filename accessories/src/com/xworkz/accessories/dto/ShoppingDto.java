package com.xworkz.accessories.dto;

import com.xworkz.accessories.constant.Brands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ShoppingDto {
private String name;
private String brand;
private int price;
private double ratings;

}
