package org.tnsindia.thiskeywordDemo;
//this can be used to return the current instance of class
public class street {
	//data members
	public String name;
	public int stree_no;
	
	
	street() {
		name="Bhoomika";
		stree_no=2435;
		
	}
	
	street get()
	{
		System.out.println("The street name is:"+name+"  "+"The street numer is:"+stree_no);
		return this;
	}
	public  void display()
	{
		System.out.println("The street name is:"+name+"  "+"The street numer is:"+stree_no);
		
	}
	
	

}
