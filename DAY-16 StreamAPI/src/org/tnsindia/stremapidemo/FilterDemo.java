package org.tnsindia.stremapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>m=Arrays.asList(new Integer[]{23,45,67,56,89,65,42});
		List<Integer>obj=new ArrayList<>();
		
		
		m.stream().filter(x->x%2==0).forEach((x)->System.out.println(x+""));
		System.out.println();
		
		m.stream().distinct().forEach((x)->System.out.println(x+""));
		System.out.println();
		
		System.out.println();
		
		m.stream().limit(4).forEach((x)->System.out.println(x+""));
		System.out.println();
		System.out.println();
		
		m.stream().skip(3).forEach((x)->System.out.println(x+""));
		System.out.println();
		
	}

}
