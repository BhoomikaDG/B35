package org.tnsindia.datatype;

import java.util.Scanner;

public class IntegerUserinputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=s.nextInt();
		System.out.println("Enter the Float:");
		float y=s.nextFloat();
		System.out.println("the integer is:"+x);
		System.out.println("The Float is:"+y);
		System.out.println("Enter the character:");
		char b=s.next().charAt(0);
		System.out.println("Enter the character:"+b);
		
		System.out.println("Enter the sting:");
		String str=s.next();
		
		System.out.println("Enter the string:"+str);
		

	}

}
