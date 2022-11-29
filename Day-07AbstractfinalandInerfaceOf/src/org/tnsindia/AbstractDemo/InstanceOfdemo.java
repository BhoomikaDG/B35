package org.tnsindia.AbstractDemo;


abstract class Animal
{
	abstract void accept();
	
}
  class Lion extends Animal
  {
	  
	  void accept()
	  {
		  System.out.println("lion Roars");
		 
	  }

 }
public class InstanceOfdemo {
	public static void main(String args[])
	{
		Lion l= new Lion();
		l.accept();
		System.out.println(l instanceof Lion);
		System.out.println(l instanceof Animal);
		
	}

}
