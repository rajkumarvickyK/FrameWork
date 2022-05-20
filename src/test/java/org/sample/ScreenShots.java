package org.sample;

import java.io.IOException;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ScreenShots extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		openChromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");
		tosleep(2000);
		
		WebElement txtuser = driver.findElement(By.id("email"));
		fillTextBox(txtuser, "Rajkumar");
		takeScreenShot("aftuser");
		
		tosleep(2000);
		WebElement txtpass = driver.findElement(By.id("pass"));
		fillTextBox(txtpass, "12345678");
		takeScreenShot("aftpass");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
