package org.testng;

import org.testng.annotations.Test;

public class ExecutableClass {
	
	@Test
	private void tc5() {
	System.out.println("TestCase5 " + Thread.currentThread().getId());
	}
	
	@Test
	private void tc4() {
	System.out.println("TestCase4 " + Thread.currentThread().getId());

	}
	
	@Test
	private void tc6() {
	System.out.println("TestCase6 " + Thread.currentThread().getId());

	}
	

}
