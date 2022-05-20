package org.sample;

import java.io.IOException;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReadFromExceel extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		openChromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");
		tosleep(2000);
		toFetchTitle();
		toFetchUrl();
		
		WebElement txtuser = driver.findElement(By.id("email"));
		fillTextBox(txtuser, readFromExcel("Exc","Register", 1, 0));
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		fillTextBox(txtpass, readFromExcel("Exc", "Register", 5, 1));
		
		
		
	}

}
