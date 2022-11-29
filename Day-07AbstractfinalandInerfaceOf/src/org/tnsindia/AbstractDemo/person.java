package org.tnsindia.AbstractDemo;

public  abstract class person {
	
	//private data members
	
	private String name;
	private String gender;
	
	
	//constructor
	public person(String name,String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
		
	}
	
	//abstract method
	public abstract void work();
	
	
	public String toString()
	{
		return "person[name=" + name +",gender=" + gender + "]";
		               
		
	}
	public void ChangeName(String newname)
	{
		name=newname;
	}

}
