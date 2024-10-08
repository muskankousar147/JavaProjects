package com.xworkz.exceptions;

import lombok.ToString;

@ToString
public class MobileShallow implements Cloneable {
public String name;
public int price;
public String version;
public double ratings;
public String brand;
public String custName;
public String shopName;
public String ownerName;

@Override
public MobileShallow clone() throws  CloneNotSupportedException{
	System.out.println("details of the mobile");
	return (MobileShallow)super.clone();
}
}
