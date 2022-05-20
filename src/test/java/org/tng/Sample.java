package org.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@Test
	private void tc2() {
		System.out.println("Test 2");

	}

	@Test
	private void tc3() {
		System.out.println("Test 3");
	}

	@Test
	private void tc1() {
		System.out.println("Test 1");
	}

	@BeforeMethod
	private void bef() {
		System.out.println("Tc Starts--------------");

	}

	@AfterMethod
	private void aft() {
		System.out.println("Tc Ends----------------");

	}

	@BeforeClass
	private void befclass() {
		System.out.println("Bef Class-------------");

	}

	@AfterClass
	private void aftclass() {
		System.out.println("Aft Class--------------");
	}

}
