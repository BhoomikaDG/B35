package org.tnsindia.finalkeywordDemo;

public class FinalMethodWithChild extends FinalMethodWithParent{

	
	public String PAN_no;
	
	/*
	public void print()
	{
		System.out.println("the pan number is:"+PAN_no);
	
	}
	*/
	
	public void print(String PAN_no)
	{
		System.out.println("The pan number is:"+PAN_no);
	}
}
