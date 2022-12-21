package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

interface LifecycleMethodDemo {

	@Test
	default void test() {
		System.out.println("Simple test method");
	}
	
	@Test
	@BeforeEach
	default void print() {
		System.out.println("Before ecah demo");
	}
	
	@Test
	@AfterAll
	 default void Accept() {
		System.out.println("Aftre all demo");
	}
	
	@Test
	@AfterEach
	 default void soma() {
		System.out.println("Simple test method");
	}
	
	

	
}
