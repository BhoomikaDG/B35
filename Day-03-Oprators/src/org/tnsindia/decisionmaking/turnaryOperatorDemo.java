package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class turnaryOperatorDemo {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("enetr the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int result1=(a>b)?a:b;
		String result=a>b?"true":"false";
		System.out.println("the result is:"+result1);
		System.out.println("the result is:"+result);

	}

}
