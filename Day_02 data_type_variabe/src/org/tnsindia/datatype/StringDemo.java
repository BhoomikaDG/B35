package org.tnsindia.datatype;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		// Difference between next() and nextLine()
		System.out.println("Enter the sting:");
		String str=s.nextLine();
				String str1=s.next();
		System.out.println("The output is:");
		
		
		System.out.println("Enter the string:"+str);
		System.out.println("Enter the string:"+str1);
		s.close();

	}

}
