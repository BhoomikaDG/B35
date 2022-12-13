package org.tnsindia.lamdaexpressiondemo;

public class RunnableInterfaceDemoUsingLamda {

	public static void main(String[] args) {
		// 
		Runnable obj=()->
		{
			System.out.println("the runnable interface");
		};
		obj.run();

	}

}
