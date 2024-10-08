package com.xworkz.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MobileDeep implements Cloneable {
	public String name;
	public int price;
	public String version;
	public double ratings;
	public String brand;
	public String custName;
	public String shopName;
	public String ownerName;

	@Override
	public MobileDeep clone() throws  CloneNotSupportedException{
		System.out.println("details of the mobile");
		return (MobileDeep)super.clone();
	}
}
