package org.tnsindia.builtinannotationdemo;

import java.util.ArrayList;

public class SupressWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>();
		obj.add(12);
		obj.add("bhoomika");
		obj.add(13.5);
		System.out.println(obj);
		

	}

}
