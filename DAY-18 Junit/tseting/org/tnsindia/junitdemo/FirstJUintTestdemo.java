package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstJUintTestdemo {

	@Test
	// it signifies that this the test method in to which we write our code to test.
	void test() {
		System.out.println("JUnit 5 demo");
		
	}
//	@Disabled annotation makes the method as disable
	void display()
	{
		fail(" Fail to print");
	}

}
