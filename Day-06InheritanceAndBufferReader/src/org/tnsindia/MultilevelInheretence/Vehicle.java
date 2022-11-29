package org.tnsindia.MultilevelInheretence;

public class Vehicle {
	
	private String vch_name;
	public void display()
	{
		System.out.println("the name of the car is:"+vch_name);
	}
	public String getVch_name() {
		return vch_name;
	}
	public void setVch_name(String vch_name) {
		this.vch_name = vch_name;
	}

}
