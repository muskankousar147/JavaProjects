package com.xworkz.sandwitch.dto;

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
public class SandWitchMakerDto {
private String brandName;
private int price;
private String shopName;
private double ratings;
private String voltage;
private String shopLocation;
private String sellerName;
private String customerName;
private String color;
private int numOfcolors;
private long contactNumber;
private long customerContactNumber;
private String material;
private String productGst;
}
