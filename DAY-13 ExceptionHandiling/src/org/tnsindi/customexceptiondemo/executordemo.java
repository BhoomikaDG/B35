package org.tnsindi.customexceptiondemo;

import java.util.Scanner;

public class executordemo {


		public static void main(String[] args) throws logincreditionals  {
			Scanner s=new Scanner(System.in);
			String id=s.nextLine();
			String password=s.nextLine();
			//validating
			if(id!="Bhoomika@27" && password!="bho345672")
			{
				throw new logincreditionals(id, password);
			}
			
				
			
				
			}
	}
