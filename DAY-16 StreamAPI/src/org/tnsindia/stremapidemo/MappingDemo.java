package org.tnsindia.stremapidemo;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>m=Arrays.asList("Shewtha","Bhoomika","Bhuvana");
		m.forEach((i->System.out.println(i+" ")));
		m.stream().map(i->i.length()).forEach(i->System.out.println(i+" "));

	}

}
