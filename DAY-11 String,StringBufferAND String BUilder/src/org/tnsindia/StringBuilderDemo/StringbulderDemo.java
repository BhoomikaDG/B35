package org.tnsindia.StringBuilderDemo;

public class StringbulderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		
				// TODO Auto-generated method stub
		           StringBuilder s=new StringBuilder("BHoomika D G");
				
				
				//capcity method returns the current capacity
				/*The capacity is the number of charactersthat can be stored 
				(including already written characters), beyond whichan allocation will occur*/
				System.out.println(s.capacity());//by default capacity is 16+it will take length of input
				System.out.println(s.length());
				System.out.println(s.append("lax"));
				
				System.out.println(s.insert(10, "Capgemini"));
				
				System.out.println(s.capacity());//by default capacity is 16+it will take length of input
				s.setCharAt(2, 'Z');
				System.out.println(s)
;
	}

}
