package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("Bhoomika", "DG");
		
		//Execute the body when the positive condition  else test will be skipped
		Assumptions.assumeTrue("suma".equals(System.getProperty("Bhoomika")));
		Assumptions.assumeTrue("DG".equals(System.getProperty("Bhoomika")));
	}

	@Test
	void print() {
		System.setProperty("Bhoomika", "DG");
		
		//Execute the body when the negative condition  else test will be skipped
		Assumptions.assumeFalse("suma".equals(System.getProperty("Bhoomika")));
		Assumptions.assumeTrue("DG".equals(System.getProperty("Bhoomika")));
	}


	@Test
	void accept() {
		System.setProperty("Bhoomika", "DG");
		
		//Execute the body when the positive condition  else test will be skipped
		Assumptions.assumingThat("suma".equals(System.getProperty("Bhoomika")),null);
	
	
	
}
}
