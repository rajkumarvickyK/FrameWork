package org.sample;

import java.awt.AWTException;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) throws AWTException {
		
		openChromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");
		toFetchTitle();
		toFetchUrl();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		fillTextBox(txtemail, "Rajkumar");
		
		doubleClick(txtemail);
		copy();
		tab();
		past();
		
		
		
		
		
	}

}
