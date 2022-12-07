package org.tnsindia.interfacedemo;

import java.util.Scanner;

public class shape implements Area {
	
	public void rectangle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectange:");
		int length=s.nextInt();
		int bradth=s.nextInt();
		System.out.println("The area othe rectangle:"+(length*bradth));
		
		
	}
	
	public void circle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int radius=s.nextInt();
		
		System.out.println("The area othe rectangle"+(3.142*radius*radius));
		
	}

}
