package org.tnsindia.classDemo;

import java.util.Scanner;

public class ClassAndOblectDemo {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the speed of car:");
	 
	 int speed=s.nextInt();
	 
	 //creation of Object
	 car c=new car();
	 c.speed(speed);
	 s.close();

	}

}
