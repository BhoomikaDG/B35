package org.tnsindia.junitdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExecutorforLifeCycleMethod implements LifecycleMethodDemo {
	@Test
	@DisplayName("Fast Method")
  void fast()
{
    System.out.println("Fast test case");	
}
}