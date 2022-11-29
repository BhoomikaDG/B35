package org.tnsindia.MultilevelInheretence;

public class tyre extends BMW{

	private String t_name3;
	public String getT_name3() {
		return t_name3;
	}
	public void setT_name3(String t_name3) {
		this.t_name3 = t_name3;
	}
	public void display3()
	{
		System.out.println("the name of the car is:"+t_name3);
	}
}
