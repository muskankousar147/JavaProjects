package com.xworkz.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PropertiesDeep implements Cloneable{
public String name;
public int cost;

public PropertiesDeep Clone() throws CloneNotSupportedException{
	System.out.println("properties");
	return (PropertiesDeep) super.clone();
}
}
