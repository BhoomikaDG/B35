package org.tnsindia.AyyrayDemo;

import java.util.Scanner;

public class StudentExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//non-primitive array memory allocation
		Student[] arr1=new Student[3];
		System.out.println("Enter the values in the array: ");
		arr1[0]=new Student(s.nextInt(),s.nextLine());
		arr1[1]=new Student(s.nextInt(),s.nextLine());
		arr1[2]=new Student(s.nextInt(),s.nextLine());
		//to print the array elements
		System.out.println("Array elements are:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i].getRoll_no()+","+arr1[i].getName()+" ");
		}		

	}

}
