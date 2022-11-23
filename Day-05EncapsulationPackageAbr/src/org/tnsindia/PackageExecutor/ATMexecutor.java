package org.tnsindia.PackageExecutor;
import java.util.Scanner;

// importing class of another class
import org.tnsindia.PackageDemo.*;
public class ATMexecutor {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the card no:");
			String card_no=s.next();
			ATM obj= new ATM();
			obj.display(card_no);
		}

	}

}
