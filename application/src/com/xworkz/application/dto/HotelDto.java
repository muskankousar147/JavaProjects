package com.xworkz.application.dto;

import java.util.Objects;

import com.xworkz.application.constant.HotelName;


public class HotelDto {
	
private HotelName name;
private int ratings;
private String location;
private int noOfStaffs;
private String placeName;


public HotelDto() {
	System.out.println("no argument constructor");
	
}


public HotelDto(HotelName name, int ratings, String location, int noOfStaffs, String placeName) {
	this.name = name;
	this.ratings = ratings;
	this.location = location;
	this.noOfStaffs = noOfStaffs;
	this.placeName = placeName;
	System.out.println("all argument constructor");
}


public HotelName getName() {
	return name;
}


public void setName(HotelName name) {
	this.name = name;
}


public int getRatings() {
	return ratings;
}


public void setRatings(int ratings) {
	this.ratings = ratings;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


public int getNoOfStaffs() {
	return noOfStaffs;
}


public void setNoOfStaffs(int noOfStaffs) {
	this.noOfStaffs = noOfStaffs;
}


public String getPlaceName() {
	return placeName;
}


public void setPlaceName(String placeName) {
	this.placeName = placeName;
}


@Override
public int hashCode() {
	return Objects.hash(location, name, noOfStaffs, placeName, ratings);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HotelDto other = (HotelDto) obj;
	return Objects.equals(location, other.location) && name == other.name && noOfStaffs == other.noOfStaffs
			&& Objects.equals(placeName, other.placeName) && ratings == other.ratings;
}


@Override
public String toString() {
	return "HotelDto [name=" + name + ", ratings=" + ratings + ", location=" + location + ", noOfStaffs=" + noOfStaffs
			+ ", placeName=" + placeName + ", getName()=" + getName() + ", getRatings()=" + getRatings()
			+ ", getLocation()=" + getLocation() + ", getNoOfStaffs()=" + getNoOfStaffs() + ", getPlaceName()="
			+ getPlaceName() + "]";
}

}
