package org.tnsindia.StringDemo;

import java.util.Scanner;

public class SrtingMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1=s.nextLine();
		System.out.println("Enter the string2:");
		String str2=s.nextLine();
		//to combine the two strings
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		//to find the length of the string
		System.out.println("The length of the Str1 is: "+str1.length());

		/* if charcter that we passed is not present in the string , then we get -1*/
		System.out.println("The index of the Str1 is: "+str1.indexOf('w'));
		System.out.println("The char at the 3rd index of Str1 is: "+str1.charAt(3));//w
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());


	}

}
