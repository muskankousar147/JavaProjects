package com.xworkz.coffee.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class CoffeeDto {
	
	private int cost;
	private String name;
	private double weight;
	private long helpCenter; 
	private boolean condition;
	private String location;
	public boolean getCondition;

}
