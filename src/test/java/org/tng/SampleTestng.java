package org.tng;

import org.helper.BaseClass;
import org.locators.LoginPojo;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestng extends BaseClass {

	@Test
	private void tc1() {
		LoginPojo l = new LoginPojo();
		WebElement txtEmail = l.getTxtEmail();
		fillTextBox(txtEmail, "Rajkumar");
		WebElement txtPass = l.getTxtPass();
		fillTextBox(txtPass, "12345678");
		WebElement btnLog = l.getBtnLog();
		toClk(btnLog);

	}

	@BeforeClass
	private void befClass() {
		openChromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");
		impilicitWait();

	}

	@AfterClass
	private void aftCls() {
		closeBrowser();

	}
	@BeforeMethod
	 private void befmethod() {

    getdateAndTime();

	}
	@AfterMethod
	private void aftMethod() {
	getdateAndTime();

	}
	
	
	
	
	
	
	
	
	
	
	

}
