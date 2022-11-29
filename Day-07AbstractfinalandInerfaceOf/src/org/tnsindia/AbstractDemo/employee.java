package org.tnsindia.AbstractDemo;

public class employee extends person {
	
	private int ID;
	private int id;
	public employee(String name,String gender,int ID)
	{
	   super(name,gender);
	   ID = id;
	   
	} 

	@Override
	public void work() {
	
		if(ID>0)
		{
			System.out.println("Employee Exist");
			
		}
		else
		{
			System.out.println("Employee not exist");
		}
	}

}
