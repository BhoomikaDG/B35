package org.tnsindia.finalkeywordDemo;

public class SuperChildclass extends SuperParent {
	protected String name="bhoomika";
	
	SuperChildclass()
	{
		super();
		System.out.println("contructor of the chld class");
	}

	  public void accept()
	  {
		  System.out.println(name);
		  System.out.println(super.name);
		  super.accept();
	  }
}
