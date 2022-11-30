package org.tnsindia.thiskeywordDemo;
//this key word can be used to method call.
public class Vechile {
	public int speed;
	public void dispaly(Vechile v)
	{
		System.out.println("the speed othe car is:"+speed+"Km/hr");
		
	}
	void display2()
	{
		dispaly(this);
	}

}
