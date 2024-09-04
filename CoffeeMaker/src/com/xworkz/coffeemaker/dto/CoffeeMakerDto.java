package com.xworkz.coffeemaker.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CoffeeMakerDto {
private String brandName;
private int productCode;
private String address;
private double price;
private String type;
private String voltage;
}
