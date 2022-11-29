package org.tnsindia.MultilevelInheretence;

public class BMW extends Vehicle{
	private String brand_name;
	public void display1()
	{
		System.out.println("the name of the car is:"+brand_name);
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

}
