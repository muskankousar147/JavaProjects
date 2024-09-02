package com.google.vooteridapplication.things;

public class Laptop {
	private String name;
	private String generation;
	private int cost;
	private String shopName;
	private String location;
	private int num;
	private int users;
	private int ratings;
	
	//default constructor
	public Laptop() {
		System.out.println("no argument constructor");
	}
	//all argument constructor
	public Laptop(String name, String generation, int cost, String shopName, String location, int num, int users, int ratings) {
		System.out.println("all argument constructor");
		this.name = name;
		this.generation = generation;
		this.cost = cost;
		this.shopName = shopName;
		this.location = location;
		this.num = num;
		this.users = users;
		this.ratings = ratings;	
	}
	public void setLaptopname(String name) {
		this.setLaptopname(name);
	}
	public String getLaptopname() {
		return "hp";
	}
	public void setgeneration(String generation) {
		this.setgeneration(generation);
	}
	public String getgeneration() {
		return "11th";
	}
	public void setcost(int cost) {
		this.setcost(cost);
	}
	public int getcost() {
		return 10900;
	}
	public void setshopName(String shopName) {
		this.setshopName(shopName);
	}
	public String getshopName() {
		return "laptop-world";
	}
	public void setlocation(String location) {
		this.setlocation(location);
	}
	public String getlocation() {
		return "btm-layout";
	}
	public void setnum(int num) {
		this.setnum(num);
	}
	public int getnum() {
		return 35465462;
	}
	public void setusers(int users) {
		this.setusers(users);
	}
	public int getusers() {
		return 2300;
	}
	public void setratings(int ratings) {
		this.setratings(ratings);
	}
	public int getratings() {
		return 10;
	}
	
	
	@Override
		public String toString() {
			return "LaptopInfo:["+"LaptopName:"+this.name+","+"states:"+this.generation+","+"cost:"+cost+","+shopName+","+shopName+","+ location+","+ location+","+num+","+users+","+ratings+"]";
		}
	}


