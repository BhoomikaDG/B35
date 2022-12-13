package org.tnsindia.collcetionDemo;


import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>m=new LinkedHashMap<Integer,String>();
		
		
		m.put(100,"BhoomikaDG");
		m.put(1001,"Rashmi");
		m.put(1022, "nmkil");
		
		

		System.out.print(m);
	}

}
