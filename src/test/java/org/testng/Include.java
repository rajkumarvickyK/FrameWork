package org.testng;

import org.testng.annotations.Test;

public class Include {
	
	@Test(groups="Sanity")
	private void tc1() {
		System.out.println("Login");
		

	}
	@Test(groups="Sanity",priority=-4)
	private void tc4() {
		System.out.println("Email");
	}
	@Test(groups="Smokey",priority=2)
	private void tc2() {
		System.out.println("ForgetPass");
	}
	@Test(groups="Sanity",priority=-3)
	private void tc3() {
		System.out.println("Pass");

	}

}
