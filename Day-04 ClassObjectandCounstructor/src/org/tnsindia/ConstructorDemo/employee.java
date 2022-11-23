package org.tnsindia.ConstructorDemo;

public class employee {
	public String name;
	public int salary;
	//defult Constructor
	employee()
	{
		System.out.println("Default Contructor");
	}
	
	public void emploee(int salary,String name)
	{
		
		this.salary=salary;
		this.name= name;
	}
	
	public void print()
	{
		System.out.println("salary of"+name+" is "+salary);
	}
	
	
	

}
