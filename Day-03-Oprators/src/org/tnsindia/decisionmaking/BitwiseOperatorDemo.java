package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enetr the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(b>>1);
		System.out.println(a<<1);
		s.close();
	}
	

}
