package org.tnsindia.InheretenceDemo;

import java.util.Scanner;

public class SingleInhetentence {

	public static void main(String[] args) {
		System.out.println("Enter the name of the animal:");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println("Enter the name of breed:");
		String breed1=s.nextLine();
		dog d=new dog();
		
		d.name=name1;
		d.breed=breed1;
		d.display();
		d.print();
		s.close();
		
		
	}
	
}
