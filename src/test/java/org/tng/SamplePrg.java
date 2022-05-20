package org.tng;

import org.testng.annotations.Test;

public class SamplePrg {

	@Test(priority=-17,invocationCount=3)
	private void tc1() {
		System.out.println("Test1");

	}

	@Test(priority=-4)
	private void tc3() {
		System.out.println("Test3");

	}

	@Test(priority=-7)
	private void tc4() {
		System.out.println("Test4");

	}

	@Test(invocationCount=2)
	private void tc2() {
		System.out.println("Test2");

	}

	@Test(priority=-7,enabled=false)
	private void tc5() {
		System.out.println("Test5");

	}

}
