package org.tnsindia.stremapidemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String>Obj=Stream.of("Bhoomika","Bhuvana","shwetha");
		Obj.forEach((i->System.out.println(i+" ")));
		
		
		List<Integer>m=Arrays.asList(new Integer[]{23,45,67});
		m.forEach((i->System.out.println(i+" ")));
		

		System.out.println();

		Set<String>obj2=new HashSet<>();
		obj2.add("simha");
		obj2.add("riya");
		obj2.add("dali");
		System.out.println(obj2);
		obj2.forEach((i)->System.out.print(i+ " "));

		/*for(String str:obj2)
		{
			System.out.println(str);
		}*/

		
		
	}

}
