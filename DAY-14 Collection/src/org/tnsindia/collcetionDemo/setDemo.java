package org.tnsindia.collcetionDemo;

import java.util.HashSet;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arr[]=new boolean[5];
		Set<Integer>object=new HashSet<>();
		arr[1]=object.add(65);
		arr[4]=object.add(57);
		arr[3]=object.add(696);
		
		System.out.println(object);
		for(Integer  itr:object)
		{
			System.out.println(object+" ");
		}

	}

}
