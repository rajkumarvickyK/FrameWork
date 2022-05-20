package org.testng;

import org.helper.BaseClass;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest extends BaseClass {

	WebDriver driver;

	@Parameters({ "Browser" })
	@Test
	private void crossBrowser(String Browsername) {
		if (Browsername.startsWith("chr")) {
			openChromeBrowser();
		} else if (Browsername.equals("fire")) {
			openFireFoxbrowser();
		} else {
			openEdgebrowser();
		}

		launchUrl("https://www.facebook.com/");
		maxWindow();
		toFetchUrl();
		toFetchTitle();
	}

}
