package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class LogicalOpeatoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("enetr the value of a and b");
		int a=s.nextInt();
		int c=s.nextInt();
		boolean result=(a>10) && (c>50);
		System.out.println("the result is:"+result);
		s.close();
	}

}
