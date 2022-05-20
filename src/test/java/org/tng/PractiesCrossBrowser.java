package org.tng;

import org.helper.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PractiesCrossBrowser extends BaseClass {
	@Parameters("browser")
	@Test
	private void browserTest(String Browse) {
		if (Browse.startsWith("chr")) {
			openChromeBrowser();
		} else if (Browse.equals("edge")) {
			openEdgebrowser();
		}
		else {
			openFireFoxbrowser();
		}
		launchUrl("https://www.facebook.com/");
		maxWindow();
		toFetchUrl();
		toFetchTitle();

	}

}
