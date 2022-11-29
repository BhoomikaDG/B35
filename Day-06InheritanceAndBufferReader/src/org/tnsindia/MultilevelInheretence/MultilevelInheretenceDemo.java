package org.tnsindia.MultilevelInheretence;

import java.util.Scanner;

public class MultilevelInheretenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of the car:");
		
		String vch_name=s.nextLine();
		tyre t=new tyre();
		t.setVch_name(vch_name);
		t.display();
		
		System.out.println("Enter the vechile brand:");
		String brand_name=s.nextLine();
		t.setBrand_name(brand_name);
		t.display1();
		
		System.out.println("Enter the tyre name:");
		String t_name3=s.nextLine();
		t.setT_name3(t_name3);
		t.display3();
		s.close();
		
		
		

	}

}
