package org.tnsindia.AyyrayDemo;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,22,33,44,55};
		char []arr1= {'B','H','o','m'};

		//the values inside the arr1 is char but the type is int so it will convert into ascii value
		int []arr11= {'A','m','o','C'};
		float arr2[]= {10.2f,30.6f,65.0f,87.2f};
		int arr3[]=new int[4];
		arr3[0]=83;
		arr3[1]=91;
		arr3[2]=15;
		arr3[3]=26;


		System.out.println("The array elements are: "+arr[3]);
		System.out.println("The array elements are: "+arr1[1]);
		System.out.println("The array elements are: "+arr11[1]);

		System.out.println("The array elements are: "+arr2[2]);
		//to print all the array elments using enhanced(foreach) for loop
		for(int itr:arr3)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		//to print all the array elments using for loop
		for(char i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");

	}

}
	
		
	}
