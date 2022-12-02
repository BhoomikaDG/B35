package org.tnsindia.polymorphismdemo;

public class methodoverloadingsample {
 //by changing the number of arguments for method overloading
	public int  multilication(int x,int y)
	{
		System.out.println("The result is:"+(x*y));
		return x*y;
		
	}
	
	// if return type is different and prametr is same as override
	public void multilication(int x,int y,int z)
	{
		System.out.println("The result is:"+(x*y*z));
		
	}
	
}
