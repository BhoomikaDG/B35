package org.tnsindia.lamdaexpressiondemo;

public class EmployeeExecutorUsingLamda {

	public static void main(String[] args) {
		/* Lamda Expression
		Employee e=()->{
			System.out.println("Lamda Expression is not having any expreesion");
		};
		e.display();
		*/
		// Lamda Expression
				Employee m=(int a,int b)->{
					int result=(a>b)?a:b;
					System.out.println("The maximum number is:"+result);
					return result;
				};
				m.max(23,98);
				
				Employee e=(a,b)->(a>b)?a:b;
				System.out.println("the maximum number is "+e(24,76));

	}

	private static String e(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
