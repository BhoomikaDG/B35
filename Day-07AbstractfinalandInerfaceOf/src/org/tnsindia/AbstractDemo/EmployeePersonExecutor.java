package org.tnsindia.AbstractDemo;

public class EmployeePersonExecutor {

	public static void main(String[] args) {
		
		person p1=new employee("Bhoomika","female", 1);
		person p2=new employee("Bhoomika","female", -3);
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();
		

	}

}
