package com.google.vooteridapplication.things;

public class Country {
private String name;
private int states;
private int population;
private String capital;
private int noOfHospitals;
private int noOfSchools;
private int noOfHighways;

public Country() {
System.out.println("no arugument constructor");
}
public Country(String name,int states,int population,String capital,int noOfHospitals,int noOfSchools,int noOfHighways) {
	System.out.println("all arugument constructor");
	this.name = name;
	this.states = states;
	this.population = population;
	this.capital = capital;
	this.noOfHospitals = noOfHospitals;
	this.noOfSchools = noOfSchools;
	this.noOfHighways = noOfHighways;
}
public void setCountryname(String name) {
	this.setCountryname(name);
}
public String getCountryname() {
	return "india";
}
public void setstates(int states) {
	this.setstates(states);
}
public int getstates() {
	return 27;
}
public void setpopulation(int population) {
	this.setpopulation(population);
}
public int getpopulation() {
	return 23000;
}
public void setcapital(String capital) {
	this.setcapital(capital);
}
public String getcapital() {
	return "delhi";
}
public void setnoOfHospitals(int noOfHospitals) {
	this.setnoOfHospitals(noOfHospitals);
}
public int getnoOfHospitals() {
	return 1000;
}
public void setnoOfSchools(int noOfSchools) {
	this.setnoOfSchools(noOfSchools);
}
public int getnoOfSchools() {
	return 2000;
}
public void setnoOfHighways(int noOfHighways) {
	this.setnoOfHighways(noOfHighways);
}
public int getnoOfHighways() {
	return 6000;
}
@Override
public String toString() {
	return "BankInfo:["+"countryName:"+this.name+","+"states:"+this.states+","+"population:"+population+","+capital+","+noOfHospitals+","+noOfSchools+","+noOfHighways+"]";
}

}