package com.xworkz.exceptions;

import lombok.ToString;

@ToString
public class PropertiesShalow implements Cloneable{
public String name;
public int price;
@Override
public PropertiesShalow clone() throws  CloneNotSupportedException{
	System.out.println("properties are:");
	return (PropertiesShalow)super.clone();
}
}
